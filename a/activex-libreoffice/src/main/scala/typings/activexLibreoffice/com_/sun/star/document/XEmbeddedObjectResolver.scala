package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** this interface converts embedded object URLs from one URL space to another. */
trait XEmbeddedObjectResolver
  extends StObject
     with XInterface {
  
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveEmbeddedObjectURL(aURL: String): String
}
object XEmbeddedObjectResolver {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    resolveEmbeddedObjectURL: String => String
  ): XEmbeddedObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveEmbeddedObjectURL = js.Any.fromFunction1(resolveEmbeddedObjectURL))
    __obj.asInstanceOf[XEmbeddedObjectResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XEmbeddedObjectResolver] (val x: Self) extends AnyVal {
    
    inline def setResolveEmbeddedObjectURL(value: String => String): Self = StObject.set(x, "resolveEmbeddedObjectURL", js.Any.fromFunction1(value))
  }
}
