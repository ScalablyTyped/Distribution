package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlan extends StObject {
  
  /**
    * The hourly commitment, in USD.
    */
  var commitment: js.UndefOr[Amount] = js.undefined
  
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The EC2 instance family.
    */
  var ec2InstanceFamily: js.UndefOr[EC2InstanceFamily] = js.undefined
  
  /**
    * The end time.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[SavingsPlanOfferingId] = js.undefined
  
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined
  
  /**
    * The product types.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.undefined
  
  /**
    * The recurring payment amount.
    */
  var recurringPaymentAmount: js.UndefOr[Amount] = js.undefined
  
  /**
    * The AWS Region.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Savings Plan.
    */
  var savingsPlanArn: js.UndefOr[SavingsPlanArn] = js.undefined
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined
  
  /**
    * The plan type.
    */
  var savingsPlanType: js.UndefOr[SavingsPlanType] = js.undefined
  
  /**
    * The start time.
    */
  var start: js.UndefOr[String] = js.undefined
  
  /**
    * The state.
    */
  var state: js.UndefOr[SavingsPlanState] = js.undefined
  
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The duration of the term, in seconds.
    */
  var termDurationInSeconds: js.UndefOr[TermDurationInSeconds] = js.undefined
  
  /**
    * The up-front payment amount.
    */
  var upfrontPaymentAmount: js.UndefOr[Amount] = js.undefined
}
object SavingsPlan {
  
  inline def apply(): SavingsPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsPlan] (val x: Self) extends AnyVal {
    
    inline def setCommitment(value: Amount): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    inline def setCommitmentUndefined: Self = StObject.set(x, "commitment", js.undefined)
    
    inline def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2InstanceFamily(value: EC2InstanceFamily): Self = StObject.set(x, "ec2InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceFamilyUndefined: Self = StObject.set(x, "ec2InstanceFamily", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setOfferingId(value: SavingsPlanOfferingId): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    inline def setPaymentOption(value: SavingsPlanPaymentOption): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    inline def setProductTypes(value: SavingsPlanProductTypeList): Self = StObject.set(x, "productTypes", value.asInstanceOf[js.Any])
    
    inline def setProductTypesUndefined: Self = StObject.set(x, "productTypes", js.undefined)
    
    inline def setProductTypesVarargs(value: SavingsPlanProductType*): Self = StObject.set(x, "productTypes", js.Array(value*))
    
    inline def setRecurringPaymentAmount(value: Amount): Self = StObject.set(x, "recurringPaymentAmount", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentAmountUndefined: Self = StObject.set(x, "recurringPaymentAmount", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSavingsPlanArn(value: SavingsPlanArn): Self = StObject.set(x, "savingsPlanArn", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanArnUndefined: Self = StObject.set(x, "savingsPlanArn", js.undefined)
    
    inline def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanIdUndefined: Self = StObject.set(x, "savingsPlanId", js.undefined)
    
    inline def setSavingsPlanType(value: SavingsPlanType): Self = StObject.set(x, "savingsPlanType", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanTypeUndefined: Self = StObject.set(x, "savingsPlanType", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setState(value: SavingsPlanState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTermDurationInSeconds(value: TermDurationInSeconds): Self = StObject.set(x, "termDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTermDurationInSecondsUndefined: Self = StObject.set(x, "termDurationInSeconds", js.undefined)
    
    inline def setUpfrontPaymentAmount(value: Amount): Self = StObject.set(x, "upfrontPaymentAmount", value.asInstanceOf[js.Any])
    
    inline def setUpfrontPaymentAmountUndefined: Self = StObject.set(x, "upfrontPaymentAmount", js.undefined)
  }
}
