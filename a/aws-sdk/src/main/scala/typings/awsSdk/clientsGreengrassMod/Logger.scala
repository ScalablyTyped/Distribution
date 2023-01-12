package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /**
    * The component that will be subject to logging.
    */
  var Component: LoggerComponent
  
  /**
    * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string
  
  /**
    * The level of the logs.
    */
  var Level: LoggerLevel
  
  /**
    * The amount of file space, in KB, to use if the local file system is used for logging purposes.
    */
  var Space: js.UndefOr[integer] = js.undefined
  
  /**
    * The type of log output which will be used.
    */
  var Type: LoggerType
}
object Logger {
  
  inline def apply(Component: LoggerComponent, Id: string, Level: LoggerLevel, Type: LoggerType): Logger = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: LoggerComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: integer): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "Space", js.undefined)
    
    inline def setType(value: LoggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
