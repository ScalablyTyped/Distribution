package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolchain extends StObject {
  
  /**
    * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.
    */
  var source: ToolchainSource
  
  /**
    * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
    */
  var stackParameters: js.UndefOr[TemplateParameterMap] = js.undefined
}
object Toolchain {
  
  inline def apply(source: ToolchainSource): Toolchain = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolchain]
  }
  
  extension [Self <: Toolchain](x: Self) {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setSource(value: ToolchainSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStackParameters(value: TemplateParameterMap): Self = StObject.set(x, "stackParameters", value.asInstanceOf[js.Any])
    
    inline def setStackParametersUndefined: Self = StObject.set(x, "stackParameters", js.undefined)
  }
}
