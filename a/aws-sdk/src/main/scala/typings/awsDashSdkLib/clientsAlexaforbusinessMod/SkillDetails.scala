package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillDetails extends js.Object {
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[BulletPoints] = js.undefined
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[DeveloperInfo] = js.undefined
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[EndUserLicenseAgreement] = js.undefined
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[GenericKeywords] = js.undefined
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[InvocationPhrase] = js.undefined
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[NewInThisVersionBulletPoints] = js.undefined
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[ProductDescription] = js.undefined
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[ReleaseDate] = js.undefined
  /**
    * The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[Reviews] = js.undefined
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[SkillTypes] = js.undefined
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
    if (BulletPoints != null) __obj.updateDynamic("BulletPoints")(BulletPoints)
    if (DeveloperInfo != null) __obj.updateDynamic("DeveloperInfo")(DeveloperInfo)
    if (EndUserLicenseAgreement != null) __obj.updateDynamic("EndUserLicenseAgreement")(EndUserLicenseAgreement)
    if (GenericKeywords != null) __obj.updateDynamic("GenericKeywords")(GenericKeywords)
    if (InvocationPhrase != null) __obj.updateDynamic("InvocationPhrase")(InvocationPhrase)
    if (NewInThisVersionBulletPoints != null) __obj.updateDynamic("NewInThisVersionBulletPoints")(NewInThisVersionBulletPoints)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (ReleaseDate != null) __obj.updateDynamic("ReleaseDate")(ReleaseDate)
    if (Reviews != null) __obj.updateDynamic("Reviews")(Reviews)
    if (SkillTypes != null) __obj.updateDynamic("SkillTypes")(SkillTypes)
    __obj.asInstanceOf[SkillDetails]
  }
}

