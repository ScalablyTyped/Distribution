package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel {
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  var ChartTypeManager: XChartTypeManager
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  val DataProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  var FirstDiagram: XDiagram
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  val PageBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** Creates a default chart type for a brand-new chart object. */
  def createDefaultChart(): scala.Unit
  /**
    * creates an internal com::sun::star::chart2::XDataProvider that is handled by the chart document itself.
    *
    * When the model is stored, the data provider will also be stored in a sub-storage.
    * @param bCloneExistingData if `TRUE` and a data provider was previously attached, its referred data will be copied to the new internal data provider. Not
    * @throws com::sun::star::util:CloseVetoException If the new data provider could not be created due to a failed removal of the former data provider.
    */
  def createInternalDataProvider(bCloneExistingData: scala.Boolean): scala.Unit
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def getChartTypeManager(): XChartTypeManager
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  def getDataProvider(): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def getFirstDiagram(): XDiagram
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  def getPageBackground(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns `TRUE` if the data provider set at the chart document is an internal one.  This is the case directly after {@link createInternalDataProvider()} h */
  def hasInternalDataProvider(): scala.Boolean
  /** Returns true if the chart is based on OpenGL */
  def isOpenGLChart(): scala.Boolean
  /** sets a new component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def setChartTypeManager(xNewManager: XChartTypeManager): scala.Unit
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name setDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def setFirstDiagram(xDiagram: XDiagram): scala.Unit
}

