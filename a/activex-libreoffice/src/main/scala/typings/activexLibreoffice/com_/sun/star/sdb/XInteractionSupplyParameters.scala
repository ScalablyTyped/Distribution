package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back parameter data.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.ParametersRequest} .
  */
trait XInteractionSupplyParameters
  extends StObject
     with XInteractionContinuation {
  
  /**
    * set the parameters chosen by the interaction handler
    * @param Values the parameters to set
    */
  def setParameters(Values: SeqEquiv[PropertyValue]): Unit
}
object XInteractionSupplyParameters {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setParameters: SeqEquiv[PropertyValue] => Unit
  ): XInteractionSupplyParameters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[XInteractionSupplyParameters]
  }
  
  @scala.inline
  implicit class XInteractionSupplyParametersMutableBuilder[Self <: XInteractionSupplyParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetParameters(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setParameters", js.Any.fromFunction1(value))
  }
}
