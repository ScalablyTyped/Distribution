package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceKeyword extends StObject {
  
  /**
    *  The input method for the keyword. 
    */
  var keywordInputType: js.UndefOr[KeywordInputType] = js.undefined
  
  /**
    *  The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call.  If you’re mapping a data source to a rule in Config, the keywordValue that you specify depends on the type of rule:   For managed rules, you can use the rule identifier as the keywordValue. You can find the rule identifier from the list of Config managed rules.   Managed rule name: s3-bucket-acl-prohibited   keywordValue: S3_BUCKET_ACL_PROHIBITED      For custom rules, you form the keywordValue by adding the Custom_ prefix to the rule name. This prefix distinguishes the rule from a managed rule.   Custom rule name: my-custom-config-rule  keywordValue: Custom_my-custom-config-rule      For service-linked rules, you form the keywordValue by adding the Custom_ prefix to the rule name. In addition, you remove the suffix ID that appears at the end of the rule name.   Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w  keywordValue: Custom_CustomRuleForAccount-conformance-pack    Service-linked rule name: securityhub-api-gw-cache-encrypted-101104e1  keywordValue: Custom_securityhub-api-gw-cache-encrypted    Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba  keywordValue: Custom_OrgConfigRule-s3-bucket-versioning-enabled     
    */
  var keywordValue: js.UndefOr[KeywordValue] = js.undefined
}
object SourceKeyword {
  
  inline def apply(): SourceKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceKeyword] (val x: Self) extends AnyVal {
    
    inline def setKeywordInputType(value: KeywordInputType): Self = StObject.set(x, "keywordInputType", value.asInstanceOf[js.Any])
    
    inline def setKeywordInputTypeUndefined: Self = StObject.set(x, "keywordInputType", js.undefined)
    
    inline def setKeywordValue(value: KeywordValue): Self = StObject.set(x, "keywordValue", value.asInstanceOf[js.Any])
    
    inline def setKeywordValueUndefined: Self = StObject.set(x, "keywordValue", js.undefined)
  }
}
