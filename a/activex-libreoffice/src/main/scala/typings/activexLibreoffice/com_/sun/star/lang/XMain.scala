package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Executing interface for executable components run by the uno executable loader. This is an application to run components passing the command line
  * arguments.
  */
trait XMain
  extends StObject
     with XInterface {
  
  /**
    * This method is called to run the component.
    * @param aArguments arguments passed to the component, i.e. the command line arguments
    * @returns return value passed to be returned by main()
    */
  def run(aArguments: SeqEquiv[String]): Double
}
object XMain {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    run: SeqEquiv[String] => Double
  ): XMain = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[XMain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMain] (val x: Self) extends AnyVal {
    
    inline def setRun(value: SeqEquiv[String] => Double): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
