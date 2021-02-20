package typings.apidoc

import typings.apidoc.mod.ParsedFile
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: Record[String, _] = js.native
    
    var project: Record[String, _] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: Record[String, _], project: Record[String, _]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: Record[String, _]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    var title: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: String, name: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocBlocksRegExp extends StObject {
    
    var docBlocksRegExp: RegExp = js.native
    
    var inlineRegExp: RegExp = js.native
  }
  object DocBlocksRegExp {
    
    @scala.inline
    def apply(docBlocksRegExp: RegExp, inlineRegExp: RegExp): DocBlocksRegExp = {
      val __obj = js.Dynamic.literal(docBlocksRegExp = docBlocksRegExp.asInstanceOf[js.Any], inlineRegExp = inlineRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocBlocksRegExp]
    }
    
    @scala.inline
    implicit class DocBlocksRegExpMutableBuilder[Self <: DocBlocksRegExp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocBlocksRegExp(value: RegExp): Self = StObject.set(x, "docBlocksRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRegExp(value: RegExp): Self = StObject.set(x, "inlineRegExp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetGroup extends StObject {
    
    var getGroup: js.UndefOr[js.Function0[String]] = js.native
    
    var markdownFields: js.UndefOr[js.Array[String]] = js.native
    
    var markdownRemovePTags: js.UndefOr[js.Array[String]] = js.native
    
    def parse(content: String, source: String, messages: String): Description = js.native
    
    var path: String = js.native
  }
  object GetGroup {
    
    @scala.inline
    def apply(parse: (String, String, String) => Description, path: String): GetGroup = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroup]
    }
    
    @scala.inline
    implicit class GetGroupMutableBuilder[Self <: GetGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetGroup(value: () => String): Self = StObject.set(x, "getGroup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      @scala.inline
      def setMarkdownFields(value: js.Array[String]): Self = StObject.set(x, "markdownFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdownFieldsUndefined: Self = StObject.set(x, "markdownFields", js.undefined)
      
      @scala.inline
      def setMarkdownFieldsVarargs(value: String*): Self = StObject.set(x, "markdownFields", js.Array(value :_*))
      
      @scala.inline
      def setMarkdownRemovePTags(value: js.Array[String]): Self = StObject.set(x, "markdownRemovePTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdownRemovePTagsUndefined: Self = StObject.set(x, "markdownRemovePTags", js.undefined)
      
      @scala.inline
      def setMarkdownRemovePTagsVarargs(value: String*): Self = StObject.set(x, "markdownRemovePTags", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: (String, String, String) => Description): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Global extends StObject {
    
    var global: js.Any = js.native
    
    var local: js.Any = js.native
  }
  object Global {
    
    @scala.inline
    def apply(global: js.Any, local: js.Any): Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: js.Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: js.Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostFilter extends StObject {
    
    def postFilter(parsedFiles: js.Array[ParsedFile], parsedFilenames: js.Array[String]): Unit = js.native
  }
  object PostFilter {
    
    @scala.inline
    def apply(postFilter: (js.Array[ParsedFile], js.Array[String]) => Unit): PostFilter = {
      val __obj = js.Dynamic.literal(postFilter = js.Any.fromFunction2(postFilter))
      __obj.asInstanceOf[PostFilter]
    }
    
    @scala.inline
    implicit class PostFilterMutableBuilder[Self <: PostFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostFilter(value: (js.Array[ParsedFile], js.Array[String]) => Unit): Self = StObject.set(x, "postFilter", js.Any.fromFunction2(value))
    }
  }
}
