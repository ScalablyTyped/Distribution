package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInputSource extends StObject {
  
  /**
    * The namespace on your Amazon Elastic Kubernetes Service cluster.
    */
  var eksSourceClusterNamespace: js.UndefOr[EksSourceClusterNamespace] = js.undefined
  
  /**
    * The resource type of the input source.
    */
  var importType: ResourceMappingType
  
  /**
    * The number of resources.
    */
  var resourceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var sourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the input source.
    */
  var sourceName: js.UndefOr[String255] = js.undefined
  
  /**
    * The name of the Terraform s3 state ﬁle.
    */
  var terraformSource: js.UndefOr[TerraformSource] = js.undefined
}
object AppInputSource {
  
  inline def apply(importType: ResourceMappingType): AppInputSource = {
    val __obj = js.Dynamic.literal(importType = importType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInputSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInputSource] (val x: Self) extends AnyVal {
    
    inline def setEksSourceClusterNamespace(value: EksSourceClusterNamespace): Self = StObject.set(x, "eksSourceClusterNamespace", value.asInstanceOf[js.Any])
    
    inline def setEksSourceClusterNamespaceUndefined: Self = StObject.set(x, "eksSourceClusterNamespace", js.undefined)
    
    inline def setImportType(value: ResourceMappingType): Self = StObject.set(x, "importType", value.asInstanceOf[js.Any])
    
    inline def setResourceCount(value: Integer): Self = StObject.set(x, "resourceCount", value.asInstanceOf[js.Any])
    
    inline def setResourceCountUndefined: Self = StObject.set(x, "resourceCount", js.undefined)
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "sourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "sourceArn", js.undefined)
    
    inline def setSourceName(value: String255): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    inline def setTerraformSource(value: TerraformSource): Self = StObject.set(x, "terraformSource", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourceUndefined: Self = StObject.set(x, "terraformSource", js.undefined)
  }
}
