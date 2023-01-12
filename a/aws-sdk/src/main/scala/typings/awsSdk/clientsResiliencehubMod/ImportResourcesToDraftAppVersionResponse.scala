package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportResourcesToDraftAppVersionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The Amazon Resource Names (ARNs) for the resources that you imported.
    */
  var sourceArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: ResourceImportStatusType
  
  /**
    *  A list of terraform file s3 URLs you need to import. 
    */
  var terraformSources: js.UndefOr[TerraformSourceList] = js.undefined
}
object ImportResourcesToDraftAppVersionResponse {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion, status: ResourceImportStatusType): ImportResourcesToDraftAppVersionResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportResourcesToDraftAppVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportResourcesToDraftAppVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceArns(value: ArnList): Self = StObject.set(x, "sourceArns", value.asInstanceOf[js.Any])
    
    inline def setSourceArnsUndefined: Self = StObject.set(x, "sourceArns", js.undefined)
    
    inline def setSourceArnsVarargs(value: Arn*): Self = StObject.set(x, "sourceArns", js.Array(value*))
    
    inline def setStatus(value: ResourceImportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTerraformSources(value: TerraformSourceList): Self = StObject.set(x, "terraformSources", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourcesUndefined: Self = StObject.set(x, "terraformSources", js.undefined)
    
    inline def setTerraformSourcesVarargs(value: TerraformSource*): Self = StObject.set(x, "terraformSources", js.Array(value*))
  }
}
