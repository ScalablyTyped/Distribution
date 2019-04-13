package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
    */
  var CopyOptions: js.UndefOr[CopyOptions] = js.undefined
  /**
    *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
    */
  var IdempotencyToken: awsDashSdkLib.clientsServicecatalogMod.IdempotencyToken
  /**
    * The Amazon Resource Name (ARN) of the source product.
    */
  var SourceProductArn: ProductArn
  /**
    * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
    */
  var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined
  /**
    * The identifier of the target product. By default, a new product is created.
    */
  var TargetProductId: js.UndefOr[Id] = js.undefined
  /**
    * A name for the target product. The default is the name of the source product.
    */
  var TargetProductName: js.UndefOr[ProductViewName] = js.undefined
}

object CopyProductInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    SourceProductArn: ProductArn,
    AcceptLanguage: AcceptLanguage = null,
    CopyOptions: CopyOptions = null,
    SourceProvisioningArtifactIdentifiers: SourceProvisioningArtifactProperties = null,
    TargetProductId: Id = null,
    TargetProductName: ProductViewName = null
  ): CopyProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, SourceProductArn = SourceProductArn)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (CopyOptions != null) __obj.updateDynamic("CopyOptions")(CopyOptions)
    if (SourceProvisioningArtifactIdentifiers != null) __obj.updateDynamic("SourceProvisioningArtifactIdentifiers")(SourceProvisioningArtifactIdentifiers)
    if (TargetProductId != null) __obj.updateDynamic("TargetProductId")(TargetProductId)
    if (TargetProductName != null) __obj.updateDynamic("TargetProductName")(TargetProductName)
    __obj.asInstanceOf[CopyProductInput]
  }
}

