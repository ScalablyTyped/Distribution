package typings.awsSdk.anon

import typings.awsSdk.acmMod.Arn
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/acm.DescribeCertificateRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCertificateReques extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var CertificateArn: Arn
}
object DescribeCertificateReques {
  
  @scala.inline
  def apply(CertificateArn: Arn): DescribeCertificateReques = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateReques]
  }
  
  @scala.inline
  implicit class DescribeCertificateRequesMutableBuilder[Self <: DescribeCertificateReques] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
