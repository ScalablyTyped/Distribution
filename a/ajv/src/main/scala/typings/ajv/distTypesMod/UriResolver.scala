package typings.ajv.distTypesMod

import typings.uriJs.mod.URIComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriResolver extends StObject {
  
  def parse(uri: String): URIComponents
  
  def resolve(base: String, path: String): String
  
  def serialize(component: URIComponents): String
}
object UriResolver {
  
  inline def apply(
    parse: String => URIComponents,
    resolve: (String, String) => String,
    serialize: URIComponents => String
  ): UriResolver = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), resolve = js.Any.fromFunction2(resolve), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[UriResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UriResolver] (val x: Self) extends AnyVal {
    
    inline def setParse(value: String => URIComponents): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setResolve(value: (String, String) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    
    inline def setSerialize(value: URIComponents => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
