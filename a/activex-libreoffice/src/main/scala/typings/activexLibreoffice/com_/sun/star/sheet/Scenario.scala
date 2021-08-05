package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a scenario in a spreadsheet document. */
trait Scenario
  extends StObject
     with XScenario
     with XScenarioEnhanced
     with XPropertySet
     with XNamed {
  
  /** specifies the color of the border of the scenario. */
  var BorderColor: Double
  
  /** specifies if the data should be copied back into the scenario. */
  var CopyBack: Boolean
  
  /** specifies if the formulas are copied or only the results. */
  var CopyFormulas: Boolean
  
  /** specifies if the styles are copied. */
  var CopyStyles: Boolean
  
  /** specifies if the scenario is active. */
  var IsActive: Boolean
  
  /** specifies if the scenario prints a border. */
  var PrintBorder: Boolean
  
  /** specifies if the scenario is protected. */
  var Protected: Boolean
  
  /** specifies if the scenario shows a border. */
  var ShowBorder: Boolean
}
object Scenario {
  
  inline def apply(
    BorderColor: Double,
    CopyBack: Boolean,
    CopyFormulas: Boolean,
    CopyStyles: Boolean,
    IsActive: Boolean,
    IsScenario: Boolean,
    Name: String,
    PrintBorder: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Protected: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    ScenarioComment: String,
    ShowBorder: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRanges: () => SafeArray[CellRangeAddress],
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setScenarioComment: String => Unit
  ): Scenario = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor.asInstanceOf[js.Any], CopyBack = CopyBack.asInstanceOf[js.Any], CopyFormulas = CopyFormulas.asInstanceOf[js.Any], CopyStyles = CopyStyles.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], IsScenario = IsScenario.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrintBorder = PrintBorder.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Protected = Protected.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], ShowBorder = ShowBorder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRanges = js.Any.fromFunction1(addRanges), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRanges = js.Any.fromFunction0(getRanges), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
    __obj.asInstanceOf[Scenario]
  }
  
  extension [Self <: Scenario](x: Self) {
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setCopyBack(value: Boolean): Self = StObject.set(x, "CopyBack", value.asInstanceOf[js.Any])
    
    inline def setCopyFormulas(value: Boolean): Self = StObject.set(x, "CopyFormulas", value.asInstanceOf[js.Any])
    
    inline def setCopyStyles(value: Boolean): Self = StObject.set(x, "CopyStyles", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    inline def setPrintBorder(value: Boolean): Self = StObject.set(x, "PrintBorder", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "Protected", value.asInstanceOf[js.Any])
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "ShowBorder", value.asInstanceOf[js.Any])
  }
}
