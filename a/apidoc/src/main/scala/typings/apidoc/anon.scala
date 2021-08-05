package typings.apidoc

import typings.apidoc.mod.ParsedFile
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Record[String, js.Any]
    
    var project: Record[String, js.Any]
  }
  object Data {
    
    inline def apply(data: Record[String, js.Any], project: Record[String, js.Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Record[String, js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Record[String, js.Any]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var name: String
    
    var title: String
  }
  object Description {
    
    inline def apply(description: String, name: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocBlocksRegExp extends StObject {
    
    var docBlocksRegExp: RegExp
    
    var inlineRegExp: RegExp
  }
  object DocBlocksRegExp {
    
    inline def apply(docBlocksRegExp: RegExp, inlineRegExp: RegExp): DocBlocksRegExp = {
      val __obj = js.Dynamic.literal(docBlocksRegExp = docBlocksRegExp.asInstanceOf[js.Any], inlineRegExp = inlineRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocBlocksRegExp]
    }
    
    extension [Self <: DocBlocksRegExp](x: Self) {
      
      inline def setDocBlocksRegExp(value: RegExp): Self = StObject.set(x, "docBlocksRegExp", value.asInstanceOf[js.Any])
      
      inline def setInlineRegExp(value: RegExp): Self = StObject.set(x, "inlineRegExp", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetGroup extends StObject {
    
    var getGroup: js.UndefOr[js.Function0[String]] = js.undefined
    
    var markdownFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var markdownRemovePTags: js.UndefOr[js.Array[String]] = js.undefined
    
    def parse(content: String, source: String, messages: String): Description
    
    var path: String
  }
  object GetGroup {
    
    inline def apply(parse: (String, String, String) => Description, path: String): GetGroup = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroup]
    }
    
    extension [Self <: GetGroup](x: Self) {
      
      inline def setGetGroup(value: () => String): Self = StObject.set(x, "getGroup", js.Any.fromFunction0(value))
      
      inline def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      inline def setMarkdownFields(value: js.Array[String]): Self = StObject.set(x, "markdownFields", value.asInstanceOf[js.Any])
      
      inline def setMarkdownFieldsUndefined: Self = StObject.set(x, "markdownFields", js.undefined)
      
      inline def setMarkdownFieldsVarargs(value: String*): Self = StObject.set(x, "markdownFields", js.Array(value :_*))
      
      inline def setMarkdownRemovePTags(value: js.Array[String]): Self = StObject.set(x, "markdownRemovePTags", value.asInstanceOf[js.Any])
      
      inline def setMarkdownRemovePTagsUndefined: Self = StObject.set(x, "markdownRemovePTags", js.undefined)
      
      inline def setMarkdownRemovePTagsVarargs(value: String*): Self = StObject.set(x, "markdownRemovePTags", js.Array(value :_*))
      
      inline def setParse(value: (String, String, String) => Description): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global extends StObject {
    
    var global: js.Any
    
    var local: js.Any
  }
  object Global {
    
    inline def apply(global: js.Any, local: js.Any): Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setGlobal(value: js.Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: js.Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostFilter extends StObject {
    
    def postFilter(parsedFiles: js.Array[ParsedFile], parsedFilenames: js.Array[String]): Unit
  }
  object PostFilter {
    
    inline def apply(postFilter: (js.Array[ParsedFile], js.Array[String]) => Unit): PostFilter = {
      val __obj = js.Dynamic.literal(postFilter = js.Any.fromFunction2(postFilter))
      __obj.asInstanceOf[PostFilter]
    }
    
    extension [Self <: PostFilter](x: Self) {
      
      inline def setPostFilter(value: (js.Array[ParsedFile], js.Array[String]) => Unit): Self = StObject.set(x, "postFilter", js.Any.fromFunction2(value))
    }
  }
}
