package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFrameworkOutput extends StObject {
  
  /**
    * The date and time that a framework is created, in ISO 8601 representation. The value of CreationTime is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00 represents the 10th of July 2020 at 3:00 PM 8 hours behind UTC.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var FrameworkArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var FrameworkName: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkName] = js.undefined
}
object UpdateFrameworkOutput {
  
  inline def apply(): UpdateFrameworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFrameworkOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFrameworkOutput] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFrameworkArn(value: ARN): Self = StObject.set(x, "FrameworkArn", value.asInstanceOf[js.Any])
    
    inline def setFrameworkArnUndefined: Self = StObject.set(x, "FrameworkArn", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "FrameworkName", js.undefined)
  }
}
