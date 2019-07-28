package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTask extends Task {
  /**
    * Generates a report and returns the output as formatted HTML.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#generateReport)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.reportId The id of the report.
    * @param params.user The user name requesting the report.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def generateReport(params: ReportTaskGenerateReportParams): IPromise[String] = js.native
  def generateReport(params: ReportTaskGenerateReportParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Gets all the [reports](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#Report) that are configured in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getAllReports)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAllReports(): IPromise[Report] = js.native
  def getAllReports(requestOptions: js.Any): IPromise[Report] = js.native
  /**
    * Returns the URL string for the report content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportContentUrl)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.reportId The id of the report.
    * @param params.user The username of the user requesting the report content.
    *
    */
  def getReportContentUrl(params: ReportTaskGetReportContentUrlParams): String = js.native
  /**
    * Executes a report and returns the raw [report data](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#ReportData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportData)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.reportId The id of the report.
    * @param params.user The username of the user requesting the report data.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getReportData(params: ReportTaskGetReportDataParams): IPromise[ReportData] = js.native
  def getReportData(params: ReportTaskGetReportDataParams, requestOptions: js.Any): IPromise[ReportData] = js.native
  /**
    * Gets the XSLT stylesheet for the specified report.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html#getReportStylesheet)
    *
    * @param reportId The id of the report.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getReportStylesheet(reportId: Double): IPromise[String] = js.native
  def getReportStylesheet(reportId: Double, requestOptions: js.Any): IPromise[String] = js.native
}

@JSGlobal("__esri.ReportTask")
@js.native
/**
  * Helps you generate reports about the work being managed in your Workflow Manager system.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ReportTask.html)
  */
class ReportTaskCls () extends ReportTask {
  def this(properties: ReportTaskProperties) = this()
}

