package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkillDetails extends StObject {
  
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[typings.awsSdk.alexaforbusinessMod.BulletPoints] = js.undefined
  
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeveloperInfo] = js.undefined
  
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EndUserLicenseAgreement] = js.undefined
  
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[typings.awsSdk.alexaforbusinessMod.GenericKeywords] = js.undefined
  
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[typings.awsSdk.alexaforbusinessMod.InvocationPhrase] = js.undefined
  
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NewInThisVersionBulletPoints] = js.undefined
  
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProductDescription] = js.undefined
  
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ReleaseDate] = js.undefined
  
  /**
    *  This member has been deprecated.  The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Reviews] = js.undefined
  
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillTypes] = js.undefined
}
object SkillDetails {
  
  @scala.inline
  def apply(): SkillDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillDetails]
  }
  
  @scala.inline
  implicit class SkillDetailsMutableBuilder[Self <: SkillDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletPoints(value: BulletPoints): Self = StObject.set(x, "BulletPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletPointsUndefined: Self = StObject.set(x, "BulletPoints", js.undefined)
    
    @scala.inline
    def setBulletPointsVarargs(value: BulletPoint*): Self = StObject.set(x, "BulletPoints", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperInfo(value: DeveloperInfo): Self = StObject.set(x, "DeveloperInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperInfoUndefined: Self = StObject.set(x, "DeveloperInfo", js.undefined)
    
    @scala.inline
    def setEndUserLicenseAgreement(value: EndUserLicenseAgreement): Self = StObject.set(x, "EndUserLicenseAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUserLicenseAgreementUndefined: Self = StObject.set(x, "EndUserLicenseAgreement", js.undefined)
    
    @scala.inline
    def setGenericKeywords(value: GenericKeywords): Self = StObject.set(x, "GenericKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericKeywordsUndefined: Self = StObject.set(x, "GenericKeywords", js.undefined)
    
    @scala.inline
    def setGenericKeywordsVarargs(value: GenericKeyword*): Self = StObject.set(x, "GenericKeywords", js.Array(value :_*))
    
    @scala.inline
    def setInvocationPhrase(value: InvocationPhrase): Self = StObject.set(x, "InvocationPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationPhraseUndefined: Self = StObject.set(x, "InvocationPhrase", js.undefined)
    
    @scala.inline
    def setNewInThisVersionBulletPoints(value: NewInThisVersionBulletPoints): Self = StObject.set(x, "NewInThisVersionBulletPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInThisVersionBulletPointsUndefined: Self = StObject.set(x, "NewInThisVersionBulletPoints", js.undefined)
    
    @scala.inline
    def setNewInThisVersionBulletPointsVarargs(value: BulletPoint*): Self = StObject.set(x, "NewInThisVersionBulletPoints", js.Array(value :_*))
    
    @scala.inline
    def setProductDescription(value: ProductDescription): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: ReleaseDate): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    @scala.inline
    def setReviews(value: Reviews): Self = StObject.set(x, "Reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsUndefined: Self = StObject.set(x, "Reviews", js.undefined)
    
    @scala.inline
    def setSkillTypes(value: SkillTypes): Self = StObject.set(x, "SkillTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillTypesUndefined: Self = StObject.set(x, "SkillTypes", js.undefined)
    
    @scala.inline
    def setSkillTypesVarargs(value: SkillStoreType*): Self = StObject.set(x, "SkillTypes", js.Array(value :_*))
  }
}
