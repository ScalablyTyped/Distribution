package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOptions extends js.Object {
  var ccEnableArenas: js.UndefOr[Boolean] = js.undefined
  var ccGenericServices: js.UndefOr[Boolean] = js.undefined
  var csharpNamespace: js.UndefOr[String] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var goPackage: js.UndefOr[String] = js.undefined
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined
  var javaGenericServices: js.UndefOr[Boolean] = js.undefined
  var javaMultipleFiles: js.UndefOr[Boolean] = js.undefined
  var javaOuterClassname: js.UndefOr[String] = js.undefined
  var javaPackage: js.UndefOr[String] = js.undefined
  var javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined
  var objcClassPrefix: js.UndefOr[String] = js.undefined
  var optimizeFor: js.UndefOr[IFileOptionsOptimizeMode] = js.undefined
  var pyGenericServices: js.UndefOr[Boolean] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    ccEnableArenas: js.UndefOr[Boolean] = js.undefined,
    ccGenericServices: js.UndefOr[Boolean] = js.undefined,
    csharpNamespace: String = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    goPackage: String = null,
    javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined,
    javaGenericServices: js.UndefOr[Boolean] = js.undefined,
    javaMultipleFiles: js.UndefOr[Boolean] = js.undefined,
    javaOuterClassname: String = null,
    javaPackage: String = null,
    javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined,
    objcClassPrefix: String = null,
    optimizeFor: js.UndefOr[IFileOptionsOptimizeMode] = js.undefined,
    pyGenericServices: js.UndefOr[Boolean] = js.undefined
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccEnableArenas)) __obj.updateDynamic("ccEnableArenas")(ccEnableArenas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ccGenericServices)) __obj.updateDynamic("ccGenericServices")(ccGenericServices.get.asInstanceOf[js.Any])
    if (csharpNamespace != null) __obj.updateDynamic("csharpNamespace")(csharpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (goPackage != null) __obj.updateDynamic("goPackage")(goPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenerateEqualsAndHash)) __obj.updateDynamic("javaGenerateEqualsAndHash")(javaGenerateEqualsAndHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenericServices)) __obj.updateDynamic("javaGenericServices")(javaGenericServices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(javaMultipleFiles)) __obj.updateDynamic("javaMultipleFiles")(javaMultipleFiles.get.asInstanceOf[js.Any])
    if (javaOuterClassname != null) __obj.updateDynamic("javaOuterClassname")(javaOuterClassname.asInstanceOf[js.Any])
    if (javaPackage != null) __obj.updateDynamic("javaPackage")(javaPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaStringCheckUtf8)) __obj.updateDynamic("javaStringCheckUtf8")(javaStringCheckUtf8.get.asInstanceOf[js.Any])
    if (objcClassPrefix != null) __obj.updateDynamic("objcClassPrefix")(objcClassPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeFor)) __obj.updateDynamic("optimizeFor")(optimizeFor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pyGenericServices)) __obj.updateDynamic("pyGenericServices")(pyGenericServices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

