package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorldRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world you want to describe.
    */
  var world: Arn
}
object DescribeWorldRequest {
  
  inline def apply(world: Arn): DescribeWorldRequest = {
    val __obj = js.Dynamic.literal(world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorldRequest] (val x: Self) extends AnyVal {
    
    inline def setWorld(value: Arn): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}
