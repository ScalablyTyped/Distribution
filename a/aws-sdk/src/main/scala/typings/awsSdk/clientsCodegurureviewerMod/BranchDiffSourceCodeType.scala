package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchDiffSourceCodeType extends StObject {
  
  /**
    * The destination branch for a diff in an associated repository.
    */
  var DestinationBranchName: BranchName
  
  /**
    * The source branch for a diff in an associated repository.
    */
  var SourceBranchName: BranchName
}
object BranchDiffSourceCodeType {
  
  inline def apply(DestinationBranchName: BranchName, SourceBranchName: BranchName): BranchDiffSourceCodeType = {
    val __obj = js.Dynamic.literal(DestinationBranchName = DestinationBranchName.asInstanceOf[js.Any], SourceBranchName = SourceBranchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchDiffSourceCodeType]
  }
  
  extension [Self <: BranchDiffSourceCodeType](x: Self) {
    
    inline def setDestinationBranchName(value: BranchName): Self = StObject.set(x, "DestinationBranchName", value.asInstanceOf[js.Any])
    
    inline def setSourceBranchName(value: BranchName): Self = StObject.set(x, "SourceBranchName", value.asInstanceOf[js.Any])
  }
}
