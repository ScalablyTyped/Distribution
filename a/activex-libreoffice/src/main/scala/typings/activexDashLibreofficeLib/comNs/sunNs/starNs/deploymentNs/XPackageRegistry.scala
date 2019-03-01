package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to bind an UNO package.
  * @since OOo 2.0
  */
trait XPackageRegistry extends js.Object {
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: activexDashInteropLib.SafeArray[XPackageTypeInfo]
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
  def bindPackage(
    url: java.lang.String,
    mediaType: java.lang.String,
    removed: scala.Boolean,
    identifier: java.lang.String,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): activexDashInteropLib.SafeArray[XPackageTypeInfo]
  def packageRemoved(url: java.lang.String, mediaType: java.lang.String): scala.Unit
}

object XPackageRegistry {
  @scala.inline
  def apply(
    SupportedPackageTypes: activexDashInteropLib.SafeArray[XPackageTypeInfo],
    bindPackage: js.Function5[
      java.lang.String, 
      java.lang.String, 
      scala.Boolean, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      XPackage
    ],
    getSupportedPackageTypes: js.Function0[activexDashInteropLib.SafeArray[XPackageTypeInfo]],
    packageRemoved: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): XPackageRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SupportedPackageTypes")(SupportedPackageTypes)
    __obj.updateDynamic("bindPackage")(bindPackage)
    __obj.updateDynamic("getSupportedPackageTypes")(getSupportedPackageTypes)
    __obj.updateDynamic("packageRemoved")(packageRemoved)
    __obj.asInstanceOf[XPackageRegistry]
  }
}

