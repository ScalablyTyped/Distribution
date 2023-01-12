package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFrameworkInput extends StObject {
  
  /**
    * The unique name of a framework.
    */
  var FrameworkName: typings.awsSdk.clientsBackupMod.FrameworkName
}
object DescribeFrameworkInput {
  
  inline def apply(FrameworkName: FrameworkName): DescribeFrameworkInput = {
    val __obj = js.Dynamic.literal(FrameworkName = FrameworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFrameworkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFrameworkInput] (val x: Self) extends AnyVal {
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
  }
}
