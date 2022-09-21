package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenario
  extends StObject
     with XInterface {
  
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean
  
  /** returns the comment for the scenario. */
  var ScenarioComment: String
  
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
  
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit
  
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean
  
  /** returns the comment for the scenario. */
  def getScenarioComment(): String
  
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit
}
object XScenario {
  
  inline def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: () => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getScenarioComment: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setScenarioComment: String => Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
    __obj.asInstanceOf[XScenario]
  }
  
  extension [Self <: XScenario](x: Self) {
    
    inline def setAddRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "addRanges", js.Any.fromFunction1(value))
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    inline def setGetIsScenario(value: () => Boolean): Self = StObject.set(x, "getIsScenario", js.Any.fromFunction0(value))
    
    inline def setGetScenarioComment(value: () => String): Self = StObject.set(x, "getScenarioComment", js.Any.fromFunction0(value))
    
    inline def setIsScenario(value: Boolean): Self = StObject.set(x, "IsScenario", value.asInstanceOf[js.Any])
    
    inline def setScenarioComment(value: String): Self = StObject.set(x, "ScenarioComment", value.asInstanceOf[js.Any])
    
    inline def setSetScenarioComment(value: String => Unit): Self = StObject.set(x, "setScenarioComment", js.Any.fromFunction1(value))
  }
}
