package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** this interface converts graphic object URLs from one URL space to another. */
trait XGraphicObjectResolver
  extends StObject
     with XInterface {
  
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveGraphicObjectURL(aURL: String): String
}
object XGraphicObjectResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveGraphicObjectURL: String => String
  ): XGraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
    __obj.asInstanceOf[XGraphicObjectResolver]
  }
  
  @scala.inline
  implicit class XGraphicObjectResolverMutableBuilder[Self <: XGraphicObjectResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveGraphicObjectURL(value: String => String): Self = StObject.set(x, "resolveGraphicObjectURL", js.Any.fromFunction1(value))
  }
}
