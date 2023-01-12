package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsInput extends StObject {
  
  /**
    * The name of the exported output value. CloudFormation returns the stack names that are importing this value.
    */
  var ExportName: typings.awsSdk.clientsCloudformationMod.ExportName
  
  /**
    * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
}
object ListImportsInput {
  
  inline def apply(ExportName: ExportName): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsInput] (val x: Self) extends AnyVal {
    
    inline def setExportName(value: ExportName): Self = StObject.set(x, "ExportName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
