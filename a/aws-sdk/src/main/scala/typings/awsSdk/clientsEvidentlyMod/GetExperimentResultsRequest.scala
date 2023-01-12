package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentResultsRequest extends StObject {
  
  /**
    * The statistic used to calculate experiment results. Currently the only valid value is mean, which uses the mean of the collected values as the statistic.
    */
  var baseStat: js.UndefOr[ExperimentBaseStat] = js.undefined
  
  /**
    * The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after the experiment start time.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the experiment to retrieve the results of.
    */
  var experiment: ExperimentName
  
  /**
    * The names of the experiment metrics that you want to see the results of.
    */
  var metricNames: MetricNameList
  
  /**
    * In seconds, the amount of time to aggregate results together. 
    */
  var period: js.UndefOr[ResultsPeriod] = js.undefined
  
  /**
    * The name or ARN of the project that contains the experiment that you want to see the results of.
    */
  var project: ProjectRef
  
  /**
    * The names of the report types that you want to see. Currently, BayesianInference is the only valid value.
    */
  var reportNames: js.UndefOr[ExperimentReportNameList] = js.undefined
  
  /**
    * The statistics that you want to see in the returned results.    PValue specifies to use p-values for the results. A p-value is used in hypothesis testing to measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.    ConfidenceInterval specifies a confidence interval for the results. The confidence interval represents the range of values for the chosen metric that is likely to contain the true difference between the baseStat of a variation and the baseline. Evidently returns the 95% confidence interval.     TreatmentEffect is the difference in the statistic specified by the baseStat parameter between each variation and the default variation.     BaseStat returns the statistical values collected for the metric for each variation. The statistic uses the same statistic specified in the baseStat parameter. Therefore, if baseStat is mean, this returns the mean of the values collected for each variation.  
    */
  var resultStats: js.UndefOr[ExperimentResultRequestTypeList] = js.undefined
  
  /**
    * The date and time that the experiment started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The names of the experiment treatments that you want to see the results for.
    */
  var treatmentNames: TreatmentNameList
}
object GetExperimentResultsRequest {
  
  inline def apply(
    experiment: ExperimentName,
    metricNames: MetricNameList,
    project: ProjectRef,
    treatmentNames: TreatmentNameList
  ): GetExperimentResultsRequest = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], metricNames = metricNames.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], treatmentNames = treatmentNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExperimentResultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExperimentResultsRequest] (val x: Self) extends AnyVal {
    
    inline def setBaseStat(value: ExperimentBaseStat): Self = StObject.set(x, "baseStat", value.asInstanceOf[js.Any])
    
    inline def setBaseStatUndefined: Self = StObject.set(x, "baseStat", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setMetricNames(value: MetricNameList): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesVarargs(value: CwDimensionSafeName*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setPeriod(value: ResultsPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setReportNames(value: ExperimentReportNameList): Self = StObject.set(x, "reportNames", value.asInstanceOf[js.Any])
    
    inline def setReportNamesUndefined: Self = StObject.set(x, "reportNames", js.undefined)
    
    inline def setReportNamesVarargs(value: ExperimentReportName*): Self = StObject.set(x, "reportNames", js.Array(value*))
    
    inline def setResultStats(value: ExperimentResultRequestTypeList): Self = StObject.set(x, "resultStats", value.asInstanceOf[js.Any])
    
    inline def setResultStatsUndefined: Self = StObject.set(x, "resultStats", js.undefined)
    
    inline def setResultStatsVarargs(value: ExperimentResultRequestType*): Self = StObject.set(x, "resultStats", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTreatmentNames(value: TreatmentNameList): Self = StObject.set(x, "treatmentNames", value.asInstanceOf[js.Any])
    
    inline def setTreatmentNamesVarargs(value: TreatmentName*): Self = StObject.set(x, "treatmentNames", js.Array(value*))
  }
}
