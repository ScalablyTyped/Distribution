package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillDetails extends js.Object {
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[typings.awsSdk.alexaforbusinessMod.BulletPoints] = js.native
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeveloperInfo] = js.native
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EndUserLicenseAgreement] = js.native
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[typings.awsSdk.alexaforbusinessMod.GenericKeywords] = js.native
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[typings.awsSdk.alexaforbusinessMod.InvocationPhrase] = js.native
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NewInThisVersionBulletPoints] = js.native
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProductDescription] = js.native
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ReleaseDate] = js.native
  /**
    *  This member has been deprecated.  The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Reviews] = js.native
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillTypes] = js.native
}

object SkillDetails {
  @scala.inline
  def apply(): SkillDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillDetails]
  }
  @scala.inline
  implicit class SkillDetailsOps[Self <: SkillDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBulletPointsVarargs(value: BulletPoint*): Self = this.set("BulletPoints", js.Array(value :_*))
    @scala.inline
    def setBulletPoints(value: BulletPoints): Self = this.set("BulletPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulletPoints: Self = this.set("BulletPoints", js.undefined)
    @scala.inline
    def setDeveloperInfo(value: DeveloperInfo): Self = this.set("DeveloperInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperInfo: Self = this.set("DeveloperInfo", js.undefined)
    @scala.inline
    def setEndUserLicenseAgreement(value: EndUserLicenseAgreement): Self = this.set("EndUserLicenseAgreement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndUserLicenseAgreement: Self = this.set("EndUserLicenseAgreement", js.undefined)
    @scala.inline
    def setGenericKeywordsVarargs(value: GenericKeyword*): Self = this.set("GenericKeywords", js.Array(value :_*))
    @scala.inline
    def setGenericKeywords(value: GenericKeywords): Self = this.set("GenericKeywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenericKeywords: Self = this.set("GenericKeywords", js.undefined)
    @scala.inline
    def setInvocationPhrase(value: InvocationPhrase): Self = this.set("InvocationPhrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationPhrase: Self = this.set("InvocationPhrase", js.undefined)
    @scala.inline
    def setNewInThisVersionBulletPointsVarargs(value: BulletPoint*): Self = this.set("NewInThisVersionBulletPoints", js.Array(value :_*))
    @scala.inline
    def setNewInThisVersionBulletPoints(value: NewInThisVersionBulletPoints): Self = this.set("NewInThisVersionBulletPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewInThisVersionBulletPoints: Self = this.set("NewInThisVersionBulletPoints", js.undefined)
    @scala.inline
    def setProductDescription(value: ProductDescription): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    @scala.inline
    def setReleaseDate(value: ReleaseDate): Self = this.set("ReleaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDate: Self = this.set("ReleaseDate", js.undefined)
    @scala.inline
    def setReviews(value: Reviews): Self = this.set("Reviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviews: Self = this.set("Reviews", js.undefined)
    @scala.inline
    def setSkillTypesVarargs(value: SkillStoreType*): Self = this.set("SkillTypes", js.Array(value :_*))
    @scala.inline
    def setSkillTypes(value: SkillTypes): Self = this.set("SkillTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillTypes: Self = this.set("SkillTypes", js.undefined)
  }
  
}

