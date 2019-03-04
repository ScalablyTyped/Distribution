package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
trait XInvocation2 extends XInvocation {
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  val Info: activexDashInteropLib.SafeArray[InvocationInfo]
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  val MemberNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  def getInfo(): activexDashInteropLib.SafeArray[InvocationInfo]
  /**
    * returns information item for the method or property defined by aName
    * @param aName specifies the name of the method or property
    * @param bExact specifies the name of the method or property
    * @see com.sun.star.script.Invocation
    * @throws IllegalArgumentException if aName is not the name of a supported method or property
    */
  def getInfoForName(aName: java.lang.String, bExact: scala.Boolean): InvocationInfo
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  def getMemberNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XInvocation2 {
  @scala.inline
  def apply(
    Info: activexDashInteropLib.SafeArray[InvocationInfo],
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    MemberNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getInfo: js.Function0[activexDashInteropLib.SafeArray[InvocationInfo]],
    getInfoForName: js.Function2[java.lang.String, scala.Boolean, InvocationInfo],
    getIntrospection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess],
    getMemberNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getValue: js.Function1[java.lang.String, js.Any],
    hasMethod: js.Function1[java.lang.String, scala.Boolean],
    hasProperty: js.Function1[java.lang.String, scala.Boolean],
    invoke: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XInvocation2 = {
    val __obj = js.Dynamic.literal(Info = Info, Introspection = Introspection, MemberNames = MemberNames, acquire = acquire, getInfo = getInfo, getInfoForName = getInfoForName, getIntrospection = getIntrospection, getMemberNames = getMemberNames, getValue = getValue, hasMethod = hasMethod, hasProperty = hasProperty, invoke = invoke, queryInterface = queryInterface, release = release, setValue = setValue)
  
    __obj.asInstanceOf[XInvocation2]
  }
}

