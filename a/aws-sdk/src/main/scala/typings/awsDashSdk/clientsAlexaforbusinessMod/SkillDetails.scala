package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillDetails extends js.Object {
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.BulletPoints] = js.native
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeveloperInfo] = js.native
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.EndUserLicenseAgreement] = js.native
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.GenericKeywords] = js.native
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.InvocationPhrase] = js.native
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NewInThisVersionBulletPoints] = js.native
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ProductDescription] = js.native
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ReleaseDate] = js.native
  /**
    * The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Reviews] = js.native
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillTypes] = js.native
}

object SkillDetails {
  @scala.inline
  def apply(
    BulletPoints: BulletPoints = null,
    DeveloperInfo: DeveloperInfo = null,
    EndUserLicenseAgreement: EndUserLicenseAgreement = null,
    GenericKeywords: GenericKeywords = null,
    InvocationPhrase: InvocationPhrase = null,
    NewInThisVersionBulletPoints: NewInThisVersionBulletPoints = null,
    ProductDescription: ProductDescription = null,
    ReleaseDate: ReleaseDate = null,
    Reviews: Reviews = null,
    SkillTypes: SkillTypes = null
  ): SkillDetails = {
    val __obj = js.Dynamic.literal()
    if (BulletPoints != null) __obj.updateDynamic("BulletPoints")(BulletPoints.asInstanceOf[js.Any])
    if (DeveloperInfo != null) __obj.updateDynamic("DeveloperInfo")(DeveloperInfo.asInstanceOf[js.Any])
    if (EndUserLicenseAgreement != null) __obj.updateDynamic("EndUserLicenseAgreement")(EndUserLicenseAgreement.asInstanceOf[js.Any])
    if (GenericKeywords != null) __obj.updateDynamic("GenericKeywords")(GenericKeywords.asInstanceOf[js.Any])
    if (InvocationPhrase != null) __obj.updateDynamic("InvocationPhrase")(InvocationPhrase.asInstanceOf[js.Any])
    if (NewInThisVersionBulletPoints != null) __obj.updateDynamic("NewInThisVersionBulletPoints")(NewInThisVersionBulletPoints.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (ReleaseDate != null) __obj.updateDynamic("ReleaseDate")(ReleaseDate.asInstanceOf[js.Any])
    if (Reviews != null) __obj.updateDynamic("Reviews")(Reviews.asInstanceOf[js.Any])
    if (SkillTypes != null) __obj.updateDynamic("SkillTypes")(SkillTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillDetails]
  }
}

