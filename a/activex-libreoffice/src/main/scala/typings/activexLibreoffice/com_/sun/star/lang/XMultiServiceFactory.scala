package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows creating instances specified by a string name. */
@js.native
trait XMultiServiceFactory
  extends StObject
     with XInterface {
  
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  val AvailableServiceNames: SafeArray[String] = js.native
  
  /**
    * Creates an instance classified by the specified name.
    * @param aServiceSpecifier classified name of instance
    * @returns instance
    */
  def createInstance(aServiceSpecifier: String): XInterface = js.native
  def createInstance[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1363, starting with typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessible, typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessibleContext, typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotMSAAService */ Any */](aServiceSpecifier: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  
  /**
    * Creates an instance classified by the specified name and passes the arguments to that instance.
    * @param ServiceSpecifier classified name of instance
    * @param Arguments arguments passed to the instance
    * @returns instance
    */
  def createInstanceWithArguments(ServiceSpecifier: String, Arguments: SeqEquiv[Any]): XInterface = js.native
  def createInstanceWithArguments[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1363, starting with typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessible, typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessibleContext, typings.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotMSAAService */ Any */](ServiceSpecifier: K, Arguments: SeqEquiv[Any]): /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  def getAvailableServiceNames(): SafeArray[String] = js.native
}
