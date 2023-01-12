package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceState extends StObject {
  
  /**
    * An object detailing the state of Amazon Inspector scanning for Amazon EC2 resources.
    */
  var ec2: State
  
  /**
    * An object detailing the state of Amazon Inspector scanning for Amazon ECR resources.
    */
  var ecr: State
}
object ResourceState {
  
  inline def apply(ec2: State, ecr: State): ResourceState = {
    val __obj = js.Dynamic.literal(ec2 = ec2.asInstanceOf[js.Any], ecr = ecr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceState] (val x: Self) extends AnyVal {
    
    inline def setEc2(value: State): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEcr(value: State): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
  }
}
