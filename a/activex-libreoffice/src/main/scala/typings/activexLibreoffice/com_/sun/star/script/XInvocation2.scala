package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
trait XInvocation2
  extends StObject
     with XInvocation {
  
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
  
  inline def apply(
    Info: SafeArray[InvocationInfo],
    Introspection: XIntrospectionAccess,
    MemberNames: SafeArray[String],
    acquire: () => Unit,
    getInfo: () => SafeArray[InvocationInfo],
    getInfoForName: (String, Boolean) => InvocationInfo,
    getIntrospection: () => XIntrospectionAccess,
    getMemberNames: () => SafeArray[String],
    getValue: String => Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setValue: (String, Any) => Unit
  ): XInvocation2 = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInfo = js.Any.fromFunction0(getInfo), getInfoForName = js.Any.fromFunction2(getInfoForName), getIntrospection = js.Any.fromFunction0(getIntrospection), getMemberNames = js.Any.fromFunction0(getMemberNames), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XInvocation2]
  }
  
  extension [Self <: XInvocation2](x: Self) {
    
    inline def setGetInfo(value: () => SafeArray[InvocationInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setGetInfoForName(value: (String, Boolean) => InvocationInfo): Self = StObject.set(x, "getInfoForName", js.Any.fromFunction2(value))
    
    inline def setGetMemberNames(value: () => SafeArray[String]): Self = StObject.set(x, "getMemberNames", js.Any.fromFunction0(value))
    
    inline def setInfo(value: SafeArray[InvocationInfo]): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setMemberNames(value: SafeArray[String]): Self = StObject.set(x, "MemberNames", value.asInstanceOf[js.Any])
  }
}
