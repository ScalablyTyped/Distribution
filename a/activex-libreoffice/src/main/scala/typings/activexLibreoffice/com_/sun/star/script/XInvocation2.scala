package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
trait XInvocation2 extends XInvocation {
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  val Info: SafeArray[InvocationInfo]
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  val MemberNames: SafeArray[String]
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  def getInfo(): SafeArray[InvocationInfo]
  /**
    * returns information item for the method or property defined by aName
    * @param aName specifies the name of the method or property
    * @param bExact specifies the name of the method or property
    * @see com.sun.star.script.Invocation
    * @throws IllegalArgumentException if aName is not the name of a supported method or property
    */
  def getInfoForName(aName: String, bExact: Boolean): InvocationInfo
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  def getMemberNames(): SafeArray[String]
}

object XInvocation2 {
  @scala.inline
  def apply(
    Info: SafeArray[InvocationInfo],
    Introspection: XIntrospectionAccess,
    MemberNames: SafeArray[String],
    acquire: () => Unit,
    getInfo: () => SafeArray[InvocationInfo],
    getInfoForName: (String, Boolean) => InvocationInfo,
    getIntrospection: () => XIntrospectionAccess,
    getMemberNames: () => SafeArray[String],
    getValue: String => js.Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XInvocation2 = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInfo = js.Any.fromFunction0(getInfo), getInfoForName = js.Any.fromFunction2(getInfoForName), getIntrospection = js.Any.fromFunction0(getIntrospection), getMemberNames = js.Any.fromFunction0(getMemberNames), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XInvocation2]
  }
}

