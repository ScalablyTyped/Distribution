package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.uriJs.mod.URIComponents
import typings.uriJs.mod.URIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeUriMod extends Shortcut {
  
  @JSImport("ajv/dist/runtime/uri", JSImport.Default)
  @js.native
  val default: URI = js.native
  
  @js.native
  trait URI extends StObject {
    
    val SCHEMES: Any = js.native
    
    var code: String = js.native
    
    def equal(uriA: String, uriB: String): Boolean = js.native
    def equal(uriA: String, uriB: String, options: URIOptions): Boolean = js.native
    def equal(uriA: URIComponents, uriB: URIComponents): Boolean = js.native
    def equal(uriA: URIComponents, uriB: URIComponents, options: URIOptions): Boolean = js.native
    
    def escapeComponent(str: String): String = js.native
    def escapeComponent(str: String, options: URIOptions): String = js.native
    
    def normalize(uri: String): String = js.native
    def normalize(uri: String, options: URIOptions): String = js.native
    def normalize(uri: URIComponents): URIComponents = js.native
    def normalize(uri: URIComponents, options: URIOptions): URIComponents = js.native
    
    def parse(uriString: String): URIComponents = js.native
    def parse(uriString: String, options: URIOptions): URIComponents = js.native
    
    def pctDecChars(str: String): String = js.native
    
    def pctEncChar(chr: String): String = js.native
    
    def removeDotSegments(input: String): String = js.native
    
    def resolve(baseURI: String, relativeURI: String): String = js.native
    def resolve(baseURI: String, relativeURI: String, options: URIOptions): String = js.native
    
    def resolveComponents(base: URIComponents, relative: URIComponents): URIComponents = js.native
    def resolveComponents(base: URIComponents, relative: URIComponents, options: Unit, skipNormalization: Boolean): URIComponents = js.native
    def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = js.native
    def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions, skipNormalization: Boolean): URIComponents = js.native
    
    def serialize(components: URIComponents): String = js.native
    def serialize(components: URIComponents, options: URIOptions): String = js.native
    
    def unescapeComponent(str: String): String = js.native
    def unescapeComponent(str: String, options: URIOptions): String = js.native
  }
  
  type _To = URI
  
  /* This means you don't have to write `default`, but can instead just say `distRuntimeUriMod.foo` */
  override def _to: URI = default
}
