package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to modify the behavior of resolving external preferences.
  *
  * Usually, the parser has a default behavior of resolving external references (See documentation of the parser implementation). Use this interface to
  * modify or reimplement this behavior.
  */
trait XEntityResolver
  extends StObject
     with XInterface {
  
  /** @returns {@link InputSource} for the external entity.  If **aInputStream** is a valid reference to an input stream, the parser uses this {@link InputSourc */
  def resolveEntity(sPublicId: String, sSystemId: String): InputSource
}
object XEntityResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveEntity: (String, String) => InputSource
  ): XEntityResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveEntity = js.Any.fromFunction2(resolveEntity))
    __obj.asInstanceOf[XEntityResolver]
  }
  
  @scala.inline
  implicit class XEntityResolverMutableBuilder[Self <: XEntityResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveEntity(value: (String, String) => InputSource): Self = StObject.set(x, "resolveEntity", js.Any.fromFunction2(value))
  }
}
