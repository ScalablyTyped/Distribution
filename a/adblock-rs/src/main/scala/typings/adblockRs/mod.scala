package typings.adblockRs

import typings.adblockRs.anon.ALL
import typings.adblockRs.anon.HOSTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adblock-rs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("adblock-rs", "Engine")
  @js.native
  open class Engine protected () extends StObject {
    def this(rules: FilterSet, debug: Boolean) = this()
    
    def addResource(resource: ResourceType): Null = js.native
    
    def check(url: String, source_url: String, request_type: String): Boolean = js.native
    def check(url: String, source_url: String, request_type: String, debug: Boolean): Boolean = js.native
    
    def clearTags(): Null = js.native
    
    def deserialize(serialized_handle: js.typedarray.ArrayBuffer): Null = js.native
    
    def enableTag(tag: String): Null = js.native
    
    def getResource(name: String): ResourceType = js.native
    
    def serializeCompressed(): js.typedarray.ArrayBuffer = js.native
    
    def serializeRaw(): js.typedarray.ArrayBuffer = js.native
    
    def tagExists(tag: String): Boolean = js.native
    
    def useResources(resources: js.Array[ResourceType]): Null = js.native
  }
  
  object FilterFormat {
    
    @JSImport("adblock-rs", "FilterFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("adblock-rs", "FilterFormat.HOSTS")
    @js.native
    def HOSTS: String = js.native
    inline def HOSTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOSTS")(x.asInstanceOf[js.Any])
    
    @JSImport("adblock-rs", "FilterFormat.STANDARD")
    @js.native
    def STANDARD: String = js.native
    inline def STANDARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANDARD")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("adblock-rs", "FilterSet")
  @js.native
  open class FilterSet protected () extends StObject {
    def this(debug: Boolean) = this()
    
    def addFilter(filter: String): Null = js.native
    def addFilter(filter: String, opts: ParseOptions): Null = js.native
    
    def addFilters(rules: js.Array[String]): FilterListMetadata = js.native
    def addFilters(rules: js.Array[String], opts: ParseOptions): FilterListMetadata = js.native
    
    def intoContentBlocking(): (js.Tuple2[Any, js.Array[String]]) | Null = js.native
  }
  
  object RuleTypes {
    
    @JSImport("adblock-rs", "RuleTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("adblock-rs", "RuleTypes.ALL")
    @js.native
    def ALL: String = js.native
    inline def ALL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("adblock-rs", "RuleTypes.COSMETIC_ONLY")
    @js.native
    def COSMETIC_ONLY: String = js.native
    inline def COSMETIC_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COSMETIC_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("adblock-rs", "RuleTypes.NETWORK_ONLY")
    @js.native
    def NETWORK_ONLY: String = js.native
    inline def NETWORK_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ONLY")(x.asInstanceOf[js.Any])
  }
  
  inline def uBlockResources(web_accessible_resource_dir: String, redirect_resources_path: String): js.Array[ResourceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("uBlockResources")(web_accessible_resource_dir.asInstanceOf[js.Any], redirect_resources_path.asInstanceOf[js.Any])).asInstanceOf[js.Array[ResourceType]]
  inline def uBlockResources(web_accessible_resource_dir: String, redirect_resources_path: String, scriptlets_path: String): js.Array[ResourceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("uBlockResources")(web_accessible_resource_dir.asInstanceOf[js.Any], redirect_resources_path.asInstanceOf[js.Any], scriptlets_path.asInstanceOf[js.Any])).asInstanceOf[js.Array[ResourceType]]
  
  trait FilterListMetadata extends StObject {
    
    var expires: Double | Null
    
    var homepage: String | Null
    
    var redirect: String | Null
    
    var title: String | Null
  }
  object FilterListMetadata {
    
    inline def apply(): FilterListMetadata = {
      val __obj = js.Dynamic.literal(expires = null, homepage = null, redirect = null, title = null)
      __obj.asInstanceOf[FilterListMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterListMetadata] (val x: Self) extends AnyVal {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresNull: Self = StObject.set(x, "expires", null)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectNull: Self = StObject.set(x, "redirect", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var format: HOSTS
    
    var rule_types: ALL
  }
  object ParseOptions {
    
    inline def apply(format: HOSTS, rule_types: ALL): ParseOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], rule_types = rule_types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: HOSTS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setRule_types(value: ALL): Self = StObject.set(x, "rule_types", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceType extends StObject {
    
    var aliases: js.Array[String]
    
    // FIXME
    var content: String
    
    var kind: Any
    
    var name: String
  }
  object ResourceType {
    
    inline def apply(aliases: js.Array[String], content: String, kind: Any, name: String): ResourceType = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceType] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
