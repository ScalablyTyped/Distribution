package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to tunnel UNO. This means providing access to data or something else, which is not specified by UNO-IDL.
  *
  *
  *
  * Common usage: Getting a C++ object pointer in the same process, thus to use an implementation directly, most often because of a design flaw.
  */
@js.native
trait XUnoTunnel extends XInterface {
  
  /**
    * Call this method to get something which is not specified in UNO, e.g. an address to some C++ object.
    * @param aIdentifier identifier
    * @returns something
    */
  def getSomething(aIdentifier: SeqEquiv[Double]): Double = js.native
}
object XUnoTunnel {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getSomething: SeqEquiv[Double] => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnoTunnel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSomething = js.Any.fromFunction1(getSomething), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUnoTunnel]
  }
  
  @scala.inline
  implicit class XUnoTunnelMutableBuilder[Self <: XUnoTunnel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSomething(value: SeqEquiv[Double] => Double): Self = StObject.set(x, "getSomething", js.Any.fromFunction1(value))
  }
}
