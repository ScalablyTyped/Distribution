package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Execution of the {@link XCommand} animation node causes the slide show component to call back the application to perform the command. */
trait XCommand
  extends StObject
     with XAnimationNode {
  
  /** This identifies the application specific command. See documentation of used application for commands. */
  var Command: Double
  
  /**
    * The application specific parameter for this command. See documentation of used application for supported parameters for different commands and target
    * combinations.
    */
  var Parameter: js.Any
  
  /** The application specific target. See documentation of used application for supported targets. */
  var Target: js.Any
}
object XCommand {
  
  inline def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Command: Double,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parameter: js.Any,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Target: js.Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XCommand = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XCommand]
  }
  
  extension [Self <: XCommand](x: Self) {
    
    inline def setCommand(value: Double): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: js.Any): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
