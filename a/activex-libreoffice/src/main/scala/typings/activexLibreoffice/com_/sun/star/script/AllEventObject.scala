package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is a wrapper for an original event in a forwarding event.
  *
  * Usually the original event is the first argument in the array of arguments.
  */
trait AllEventObject
  extends StObject
     with EventObject {
  
  /** The arguments of the original method. */
  var Arguments: SafeArray[js.Any]
  
  /**
    * A helper value for the implementation that can be used arbitrarily.
    *
    * This field reflects the third parameter of the method {@link XAllListenerAdapterService.createAllListerAdapter()} .
    */
  var Helper: js.Any
  
  /** contains the type of the original listener. */
  var ListenerType: `type`
  
  /** The original method name on which the event was fired. */
  var MethodName: String
}
object AllEventObject {
  
  inline def apply(
    Arguments: SafeArray[js.Any],
    Helper: js.Any,
    ListenerType: `type`,
    MethodName: String,
    Source: XInterface
  ): AllEventObject = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllEventObject]
  }
  
  extension [Self <: AllEventObject](x: Self) {
    
    inline def setArguments(value: SafeArray[js.Any]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setHelper(value: js.Any): Self = StObject.set(x, "Helper", value.asInstanceOf[js.Any])
    
    inline def setListenerType(value: `type`): Self = StObject.set(x, "ListenerType", value.asInstanceOf[js.Any])
    
    inline def setMethodName(value: String): Self = StObject.set(x, "MethodName", value.asInstanceOf[js.Any])
  }
}
