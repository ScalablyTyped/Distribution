package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is fired if values for parameters are needed. */
trait DatabaseParameterEvent
  extends StObject
     with EventObject {
  
  /**
    * specifies the list of parameters which are required for opening a result set.
    *
    * Usually, a {@link com.sun.star.form.component.DataForm} fires this event when loading the form requires parameters to be filled in.
    *
    * Every parameter object supports the {@link com.sun.star.beans.XPropertySet} interface, and at least the properties **Name** and **Value**
    * @see com.sun.star.sdb.RowSet
    * @see com.sun.star.form.component.DataForm
    */
  var Parameters: XIndexAccess
}
object DatabaseParameterEvent {
  
  inline def apply(Parameters: XIndexAccess, Source: XInterface): DatabaseParameterEvent = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseParameterEvent]
  }
  
  extension [Self <: DatabaseParameterEvent](x: Self) {
    
    inline def setParameters(value: XIndexAccess): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
