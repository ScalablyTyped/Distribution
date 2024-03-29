package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to replace contents in a collection by an implicit (unique) ID: */
trait XImplicitIDReplace
  extends StObject
     with XInterface {
  
  /** replaces the content which is specified by its implicit (unique) ID with a new content. */
  def replaceByUniqueID(ID: String, aNewElement: Any): Unit
}
object XImplicitIDReplace {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    replaceByUniqueID: (String, Any) => Unit
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
    __obj.asInstanceOf[XImplicitIDReplace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XImplicitIDReplace] (val x: Self) extends AnyVal {
    
    inline def setReplaceByUniqueID(value: (String, Any) => Unit): Self = StObject.set(x, "replaceByUniqueID", js.Any.fromFunction2(value))
  }
}
