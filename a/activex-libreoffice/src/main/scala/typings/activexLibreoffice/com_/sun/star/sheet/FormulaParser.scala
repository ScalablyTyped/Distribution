package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.beans.PropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormulaParser
  extends StObject
     with PropertySet
     with XFormulaParser {
  
  /**
    * specifies whether to use English parser and formatter.
    *
    * Note: When changing this, an already existing {@link OpCodeMap} needs to be recreated internally, so for performance reasons set this **before**
    * setting the {@link OpCodeMap} .
    */
  var CompileEnglish: Boolean = js.native
  
  /**
    * contains a list of external links referenced in formulas.
    *
    * Use of this property depends on the FormulaConvention in use. It is relevant only for {@link AddressConvention.XL_OOX} to map indices to external
    * documents. The sequence must be in the order of indices used. Note that indices are 1-based, the sequence must start with an empty element.
    * @since OOo 3.1
    */
  var ExternalLinks: SafeArray[ExternalLinkInfo] = js.native
  
  /**
    * specifies which address reference style convention to use when parsing a formula string.
    * @see AddressConvention
    */
  var FormulaConvention: Double = js.native
  
  var IgnoreLeadingSpaces: Boolean = js.native
  
  /**
    * contains the complete mapping of names to op-codes.
    *
    * Names and symbols not defined here lead to a parser/print error.
    */
  var OpCodeMap: SafeArray[FormulaOpCodeMapEntry] = js.native
  
  var ParameterSeparator: String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
