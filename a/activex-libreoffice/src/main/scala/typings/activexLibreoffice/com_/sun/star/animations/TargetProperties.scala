package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of an animated target.
  *
  * This struct collects all global attributes that apply to an animation target. An animation target is anything that is referenced from a given {@link
  * XAnimationNode} tree as a target object.
  */
trait TargetProperties extends StObject {
  
  var Properties: SafeArray[NamedValue]
  
  var Target: Any
}
object TargetProperties {
  
  inline def apply(Properties: SafeArray[NamedValue], Target: Any): TargetProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetProperties] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: SafeArray[NamedValue]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
