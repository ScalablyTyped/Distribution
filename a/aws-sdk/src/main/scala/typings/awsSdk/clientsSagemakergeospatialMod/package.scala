package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AND
import typings.awsSdk.awsSdkStrings.CSV
import typings.awsSdk.awsSdkStrings.INTERPOLATION
import typings.awsSdk.awsSdkStrings.METERS
import typings.awsSdk.awsSdkStrings.PLANET_ORDER
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlgorithmNameCloudRemoval = INTERPOLATION | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEAR
  - typings.awsSdk.awsSdkStrings.BILINEAR
  - typings.awsSdk.awsSdkStrings.CUBIC
  - typings.awsSdk.awsSdkStrings.CUBICSPLINE
  - typings.awsSdk.awsSdkStrings.LANCZOS
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.RMS
  - typings.awsSdk.awsSdkStrings.MODE
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MED
  - typings.awsSdk.awsSdkStrings.Q1
  - typings.awsSdk.awsSdkStrings.Q3
  - typings.awsSdk.awsSdkStrings.SUM
  - java.lang.String
*/
type AlgorithmNameGeoMosaic = _AlgorithmNameGeoMosaic | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEAR
  - typings.awsSdk.awsSdkStrings.BILINEAR
  - typings.awsSdk.awsSdkStrings.CUBIC
  - typings.awsSdk.awsSdkStrings.CUBICSPLINE
  - typings.awsSdk.awsSdkStrings.LANCZOS
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.RMS
  - typings.awsSdk.awsSdkStrings.MODE
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MED
  - typings.awsSdk.awsSdkStrings.Q1
  - typings.awsSdk.awsSdkStrings.Q3
  - typings.awsSdk.awsSdkStrings.SUM
  - java.lang.String
*/
type AlgorithmNameResampling = _AlgorithmNameResampling | java.lang.String

type Arn = java.lang.String

type AssetsMap = StringDictionary[AssetValue]

type BinaryFile = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.NOT_EQUALS
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type DataCollectionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PREMIUM
  - typings.awsSdk.awsSdkStrings.USER
  - java.lang.String
*/
type DataCollectionType = _DataCollectionType | java.lang.String

type DataCollectionsList = js.Array[RasterDataCollectionMetadata]

type Double = scala.Double

type EarthObservationJobArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typings.awsSdk.awsSdkStrings.SERVER_ERROR
  - java.lang.String
*/
type EarthObservationJobErrorType = _EarthObservationJobErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type EarthObservationJobExportStatus = _EarthObservationJobExportStatus | java.lang.String

type EarthObservationJobList = js.Array[ListEarthObservationJobOutputConfig]

type EarthObservationJobOutputBands = js.Array[OutputBand]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type EarthObservationJobStatus = _EarthObservationJobStatus | java.lang.String

type ExecutionRoleArn = java.lang.String

type ExportEarthObservationJobInputClientTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typings.awsSdk.awsSdkStrings.SERVER_ERROR
  - java.lang.String
*/
type ExportErrorType = _ExportErrorType | java.lang.String

type ExportVectorEnrichmentJobInputClientTokenString = java.lang.String

type FilterList = js.Array[Filter]

type Float = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.YEARLY
  - java.lang.String
*/
type GroupBy = _GroupBy | java.lang.String

type ImageSourceBandList = js.Array[String]

type Integer = scala.Double

type ItemSourceList = js.Array[ItemSource]

type KmsKey = java.lang.String

type LinearRing = js.Array[Position]

type LinearRings = js.Array[LinearRing]

type LinearRingsList = js.Array[LinearRings]

type ListEarthObservationJobInputMaxResultsInteger = scala.Double

type ListRasterDataCollectionsInputMaxResultsInteger = scala.Double

type ListVectorEnrichmentJobInputMaxResultsInteger = scala.Double

type LogicalOperator = AND | java.lang.String

type MetadataProvider = PLANET_ORDER | java.lang.String

type NextToken = java.lang.String

type OperationsListInput = js.Array[Operation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INT32
  - typings.awsSdk.awsSdkStrings.FLOAT32
  - typings.awsSdk.awsSdkStrings.INT16
  - typings.awsSdk.awsSdkStrings.FLOAT64
  - typings.awsSdk.awsSdkStrings.UINT16
  - java.lang.String
*/
type OutputType = _OutputType | java.lang.String

type Position = js.Array[Double]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HIGHEST
  - typings.awsSdk.awsSdkStrings.LOWEST
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - java.lang.String
*/
type PredefinedResolution = _PredefinedResolution | java.lang.String

type PropertyFiltersList = js.Array[PropertyFilter]

type S3Uri = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StartEarthObservationJobInputClientTokenString = java.lang.String

type StartEarthObservationJobInputNameString = java.lang.String

type StartVectorEnrichmentJobInputClientTokenString = java.lang.String

type StartVectorEnrichmentJobInputNameString = java.lang.String

type String = java.lang.String

type StringListInput = js.Array[String]

type SyntheticTimestampDateTime = js.Date

type TagKeyList = js.Array[String]

type Tags = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INPUT
  - typings.awsSdk.awsSdkStrings.OUTPUT
  - java.lang.String
*/
type TargetOptions = _TargetOptions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MEAN
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - typings.awsSdk.awsSdkStrings.STANDARD_DEVIATION
  - java.lang.String
*/
type TemporalStatistics = _TemporalStatistics | java.lang.String

type TemporalStatisticsListInput = js.Array[TemporalStatistics]

type Timestamp = js.Date

type Unit = METERS | java.lang.String

type VectorEnrichmentJobArn = java.lang.String

type VectorEnrichmentJobDocumentType = CSV | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typings.awsSdk.awsSdkStrings.SERVER_ERROR
  - java.lang.String
*/
type VectorEnrichmentJobErrorType = _VectorEnrichmentJobErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typings.awsSdk.awsSdkStrings.SERVER_ERROR
  - java.lang.String
*/
type VectorEnrichmentJobExportErrorType = _VectorEnrichmentJobExportErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VectorEnrichmentJobExportStatus = _VectorEnrichmentJobExportStatus | java.lang.String

type VectorEnrichmentJobList = js.Array[ListVectorEnrichmentJobOutputConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VectorEnrichmentJobStatus = _VectorEnrichmentJobStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REVERSE_GEOCODING
  - typings.awsSdk.awsSdkStrings.MAP_MATCHING
  - java.lang.String
*/
type VectorEnrichmentJobType = _VectorEnrichmentJobType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MEAN
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - typings.awsSdk.awsSdkStrings.STANDARD_DEVIATION
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.SUM
  - java.lang.String
*/
type ZonalStatistics = _ZonalStatistics | java.lang.String

type ZonalStatisticsListInput = js.Array[ZonalStatistics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-05-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
