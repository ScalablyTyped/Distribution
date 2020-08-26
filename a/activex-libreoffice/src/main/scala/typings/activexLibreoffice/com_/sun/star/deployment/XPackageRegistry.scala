package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to bind an UNO package.
  * @since OOo 2.0
  */
@js.native
trait XPackageRegistry extends js.Object {
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: SafeArray[XPackageTypeInfo] = js.native
  /**
    * binds a package URL to a {@link XPackage} handle. The returned UNO package handle ought to late-initialize itself, thus the process of binding must
    * not be an expensive operation, because it is not abortable.
    *
    * Calling the function several time with the same parameters must result in returning the same object.
    *
    * The file or folder at the location where url points to may not exist or it was replaced. This can happen, for example, when a bundled extension was
    * removed by the setup and a user later starts OOo. Then the user data may still contain all registration data of that extension, but the actual
    * extension files do not exist anymore. The registration data must then be cleaned of all the remains of that extension. To do that one creates an
    * {@link XPackage} object on behalf of that extension and calls XPackage::revokePakage(). The parameter `removed` indicates this case. The returned
    * object may not rely on the file or folder to which refers `url` . Instead it must use previously saved data to successfully carry out the revocation
    * of this object ( {@link XPackage.revokePackage()} ).
    *
    * The implementation must ensure that there is only one instance of {@link XPackage} for the same `url` at any time. Therefore calling {@link
    * bindPackage()} again with the same `url` but different `mediaType` (the exception is, if previously an empty string was provided to cause the
    * determination of the media type) or `removed` parameters will cause an exception. An {@link com.sun.star.lang.IllegalArgumentException} will be thrown
    * in case of a different `mediaType` parameter and a {@link InvalidRemovedParameterException} is thrown if the `removed` parameter is different.
    *
    * The `identifier` parameter must be provided when `removed` = true. If not, then an {@link com.sun.star.lang.IllegalArgumentException} will be thrown.
    * @param url package URL, must be UCB conform
    * @param mediaType media type of package, empty string if to be detected
    * @param removed
    * @param identifier the identifier of the extension
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def bindPackage(url: String, mediaType: String, removed: Boolean, identifier: String, xCmdEnv: XCommandEnvironment): XPackage = js.native
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): SafeArray[XPackageTypeInfo] = js.native
  def packageRemoved(url: String, mediaType: String): Unit = js.native
}

object XPackageRegistry {
  @scala.inline
  def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    bindPackage: (String, String, Boolean, String, XCommandEnvironment) => XPackage,
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    packageRemoved: (String, String) => Unit
  ): XPackageRegistry = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], bindPackage = js.Any.fromFunction5(bindPackage), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), packageRemoved = js.Any.fromFunction2(packageRemoved))
    __obj.asInstanceOf[XPackageRegistry]
  }
  @scala.inline
  implicit class XPackageRegistryOps[Self <: XPackageRegistry] (val x: Self) extends AnyVal {
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
    def setSupportedPackageTypes(value: SafeArray[XPackageTypeInfo]): Self = this.set("SupportedPackageTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindPackage(value: (String, String, Boolean, String, XCommandEnvironment) => XPackage): Self = this.set("bindPackage", js.Any.fromFunction5(value))
    @scala.inline
    def setGetSupportedPackageTypes(value: () => SafeArray[XPackageTypeInfo]): Self = this.set("getSupportedPackageTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setPackageRemoved(value: (String, String) => Unit): Self = this.set("packageRemoved", js.Any.fromFunction2(value))
  }
  
}

