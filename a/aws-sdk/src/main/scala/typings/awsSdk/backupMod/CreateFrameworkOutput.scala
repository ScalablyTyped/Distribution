package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFrameworkOutput extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var FrameworkArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var FrameworkName: js.UndefOr[typings.awsSdk.backupMod.FrameworkName] = js.undefined
}
object CreateFrameworkOutput {
  
  inline def apply(): CreateFrameworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFrameworkOutput]
  }
  
  extension [Self <: CreateFrameworkOutput](x: Self) {
    
    inline def setFrameworkArn(value: ARN): Self = StObject.set(x, "FrameworkArn", value.asInstanceOf[js.Any])
    
    inline def setFrameworkArnUndefined: Self = StObject.set(x, "FrameworkArn", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "FrameworkName", js.undefined)
  }
}
