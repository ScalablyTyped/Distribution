package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ALL_FIELDS
import typings.awsSdk.awsSdkStrings.ALL_VALUES
import typings.awsSdk.awsSdkStrings.ALL_VISUALS
import typings.awsSdk.awsSdkStrings.FILTER_ALL_VALUES
import typings.awsSdk.awsSdkStrings.GROUP_NAME
import typings.awsSdk.awsSdkStrings.ICON_ONLY
import typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
import typings.awsSdk.awsSdkStrings.LINK
import typings.awsSdk.awsSdkStrings.NOW
import typings.awsSdk.awsSdkStrings.QUICKSIGHT
import typings.awsSdk.awsSdkStrings.SHARED
import typings.awsSdk.awsSdkStrings.StartsWith
import typings.awsSdk.awsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionList = js.Array[String]

type ActiveIAMPolicyAssignmentList = js.Array[ActiveIAMPolicyAssignment]

type AdditionalDashboardIdList = js.Array[ShortRestrictiveResourceId]

type AggregationFunctionParameters = StringDictionary[LimitedString]

type AggregationSortConfigurationList = js.Array[AggregationSortConfiguration]

type AliasName = java.lang.String

type AnalysisErrorList = js.Array[AnalysisError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typings.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typings.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type AnalysisErrorType = _AnalysisErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_USER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_SOLE_OWNER
  - typings.awsSdk.awsSdkStrings.ANALYSIS_NAME
  - java.lang.String
*/
type AnalysisFilterAttribute = _AnalysisFilterAttribute | java.lang.String

type AnalysisName = java.lang.String

type AnalysisSearchFilterList = js.Array[AnalysisSearchFilter]

type AnalysisSummaryList = js.Array[AnalysisSummary]

type AnchorOption = NOW | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMALL
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LARGE
  - typings.awsSdk.awsSdkStrings.WHOLE
  - java.lang.String
*/
type ArcThickness = _ArcThickness | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMALL
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LARGE
  - java.lang.String
*/
type ArcThicknessOptions = _ArcThicknessOptions | java.lang.String

type Arn = java.lang.String

type ArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignmentStatus = _AssignmentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM_AND_QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.IAM_ONLY
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - java.lang.String
*/
type AuthenticationMethodOption = _AuthenticationMethodOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.STDEV
  - typings.awsSdk.awsSdkStrings.STDEVP
  - typings.awsSdk.awsSdkStrings.VAR
  - typings.awsSdk.awsSdkStrings.VARP
  - typings.awsSdk.awsSdkStrings.PERCENTILE
  - java.lang.String
*/
type AuthorSpecifiedAggregation = _AuthorSpecifiedAggregation | java.lang.String

type AuthorSpecifiedAggregations = js.Array[AuthorSpecifiedAggregation]

type AwsAccountId = java.lang.String

type AwsAndAccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIMARY_YAXIS
  - typings.awsSdk.awsSdkStrings.SECONDARY_YAXIS
  - java.lang.String
*/
type AxisBinding = _AxisBinding | java.lang.String

type AxisLabelOptionsList = js.Array[AxisLabelOptions]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HORIZONTAL
  - typings.awsSdk.awsSdkStrings.VERTICAL
  - java.lang.String
*/
type BarChartOrientation = _BarChartOrientation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLUSTERED
  - typings.awsSdk.awsSdkStrings.STACKED
  - typings.awsSdk.awsSdkStrings.STACKED_PERCENT
  - java.lang.String
*/
type BarsArrangement = _BarsArrangement | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LIGHT_GRAY
  - typings.awsSdk.awsSdkStrings.DARK_GRAY
  - typings.awsSdk.awsSdkStrings.STREET
  - typings.awsSdk.awsSdkStrings.IMAGERY
  - java.lang.String
*/
type BaseMapStyleType = _BaseMapStyleType | java.lang.String

type BinCountLimit = scala.Double

type BinCountValue = scala.Double

type BinWidthValue = scala.Double

type BodySectionConfigurationList = js.Array[BodySectionConfiguration]

type Boolean = scala.Boolean

type BooleanObject = scala.Boolean

type BoxPlotDimensionFieldList = js.Array[DimensionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOLID
  - typings.awsSdk.awsSdkStrings.TRANSPARENT
  - java.lang.String
*/
type BoxPlotFillStyle = _BoxPlotFillStyle | java.lang.String

type BoxPlotMeasureFieldList = js.Array[MeasureField]

type CIDR = java.lang.String

type CalculatedColumnList = js.Array[CalculatedColumn]

type CalculatedFieldExpression = java.lang.String

type CalculatedFields = js.Array[CalculatedField]

type CascadingControlSourceList = js.Array[CascadingControlSource]

type Catalog = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - java.lang.String
*/
type CategoricalAggregationFunction = _CategoricalAggregationFunction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXACT
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type CategoryFilterFunction = _CategoryFilterFunction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.DOES_NOT_EQUAL
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.DOES_NOT_CONTAIN
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - typings.awsSdk.awsSdkStrings.ENDS_WITH
  - java.lang.String
*/
type CategoryFilterMatchOperator = _CategoryFilterMatchOperator | java.lang.String

type CategoryFilterSelectAllOptions = FILTER_ALL_VALUES | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM_FILTER
  - typings.awsSdk.awsSdkStrings.CUSTOM_FILTER_LIST
  - typings.awsSdk.awsSdkStrings.FILTER_LIST
  - java.lang.String
*/
type CategoryFilterType = _CategoryFilterType | java.lang.String

type CategoryValue = java.lang.String

type CategoryValueList = js.Array[CategoryValue]

type CellValueSynonyms = js.Array[CellValueSynonym]

type ClusterId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISCRETE
  - typings.awsSdk.awsSdkStrings.GRADIENT
  - java.lang.String
*/
type ColorFillType = _ColorFillType | java.lang.String

type ColorList = js.Array[HexColor]

type ColorScaleColorList = js.Array[DataColor]

type ColumnConfigurationList = js.Array[ColumnConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIMENSION
  - typings.awsSdk.awsSdkStrings.MEASURE
  - java.lang.String
*/
type ColumnDataRole = _ColumnDataRole | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DATETIME
  - java.lang.String
*/
type ColumnDataType = _ColumnDataType | java.lang.String

type ColumnDescriptiveText = java.lang.String

type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]

type ColumnGroupList = js.Array[ColumnGroup]

type ColumnGroupName = java.lang.String

type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]

type ColumnHierarchyList = js.Array[ColumnHierarchy]

type ColumnId = java.lang.String

type ColumnLevelPermissionRuleList = js.Array[ColumnLevelPermissionRule]

type ColumnList = js.Array[ColumnName]

type ColumnName = java.lang.String

type ColumnNameList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREATER_IS_BETTER
  - typings.awsSdk.awsSdkStrings.LESSER_IS_BETTER
  - typings.awsSdk.awsSdkStrings.SPECIFIED
  - java.lang.String
*/
type ColumnOrderingType = _ColumnOrderingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIMENSION
  - typings.awsSdk.awsSdkStrings.MEASURE
  - java.lang.String
*/
type ColumnRole = _ColumnRole | java.lang.String

type ColumnSchemaList = js.Array[ColumnSchema]

type ColumnTagList = js.Array[ColumnTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE
  - typings.awsSdk.awsSdkStrings.COLUMN_DESCRIPTION
  - java.lang.String
*/
type ColumnTagName = _ColumnTagName | java.lang.String

type ColumnTagNames = js.Array[ColumnTagName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIFFERENCE
  - typings.awsSdk.awsSdkStrings.PERCENT_DIFFERENCE
  - typings.awsSdk.awsSdkStrings.PERCENT
  - java.lang.String
*/
type ComparisonMethod = _ComparisonMethod | java.lang.String

type ComputationList = js.Array[Computation]

type ConditionalFormattingIconDisplayOption = ICON_ONLY | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PLUS_MINUS
  - typings.awsSdk.awsSdkStrings.CHECK_X
  - typings.awsSdk.awsSdkStrings.THREE_COLOR_ARROW
  - typings.awsSdk.awsSdkStrings.THREE_GRAY_ARROW
  - typings.awsSdk.awsSdkStrings.CARET_UP_MINUS_DOWN
  - typings.awsSdk.awsSdkStrings.THREE_SHAPE
  - typings.awsSdk.awsSdkStrings.THREE_CIRCLE
  - typings.awsSdk.awsSdkStrings.FLAGS
  - typings.awsSdk.awsSdkStrings.BARS
  - typings.awsSdk.awsSdkStrings.FOUR_COLOR_ARROW
  - typings.awsSdk.awsSdkStrings.FOUR_GRAY_ARROW
  - java.lang.String
*/
type ConditionalFormattingIconSetType = _ConditionalFormattingIconSetType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGULAR
  - typings.awsSdk.awsSdkStrings.RANGE
  - typings.awsSdk.awsSdkStrings.COLLECTIVE
  - java.lang.String
*/
type ConstantType = _ConstantType | java.lang.String

type ContributionAnalysisDefaultList = js.Array[ContributionAnalysisDefault]

type ContributorDimensionList = js.Array[ColumnIdentifier]

type CopySourceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_DATASETS
  - typings.awsSdk.awsSdkStrings.SINGLE_DATASET
  - java.lang.String
*/
type CrossDatasetTypes = _CrossDatasetTypes | java.lang.String

type CurrencyCode = java.lang.String

type CustomActionColumnList = js.Array[ColumnIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIT_TO_HEIGHT
  - typings.awsSdk.awsSdkStrings.FIT_TO_WIDTH
  - typings.awsSdk.awsSdkStrings.DO_NOT_SCALE
  - typings.awsSdk.awsSdkStrings.SCALE_TO_VISUAL
  - java.lang.String
*/
type CustomContentImageScalingConfiguration = _CustomContentImageScalingConfiguration | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMAGE
  - typings.awsSdk.awsSdkStrings.OTHER_EMBEDDED_CONTENT
  - java.lang.String
*/
type CustomContentType = _CustomContentType | java.lang.String

type CustomLabel = java.lang.String

type CustomSqlName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DashboardBehavior = _DashboardBehavior | java.lang.String

type DashboardErrorList = js.Array[DashboardError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typings.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typings.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type DashboardErrorType = _DashboardErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_USER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_SOLE_OWNER
  - typings.awsSdk.awsSdkStrings.DASHBOARD_NAME
  - java.lang.String
*/
type DashboardFilterAttribute = _DashboardFilterAttribute | java.lang.String

type DashboardName = java.lang.String

type DashboardSearchFilterList = js.Array[DashboardSearchFilter]

type DashboardSummaryList = js.Array[DashboardSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXPANDED
  - typings.awsSdk.awsSdkStrings.COLLAPSED
  - java.lang.String
*/
type DashboardUIState = _DashboardUIState | java.lang.String

type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALUE
  - typings.awsSdk.awsSdkStrings.PERCENT
  - typings.awsSdk.awsSdkStrings.VALUE_AND_PERCENT
  - java.lang.String
*/
type DataLabelContent = _DataLabelContent | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLE_OVERLAP
  - typings.awsSdk.awsSdkStrings.ENABLE_OVERLAP
  - java.lang.String
*/
type DataLabelOverlap = _DataLabelOverlap | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSIDE
  - typings.awsSdk.awsSdkStrings.OUTSIDE
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.TOP
  - typings.awsSdk.awsSdkStrings.BOTTOM
  - typings.awsSdk.awsSdkStrings.RIGHT
  - java.lang.String
*/
type DataLabelPosition = _DataLabelPosition | java.lang.String

type DataLabelTypes = js.Array[DataLabelType]

type DataPathColorList = js.Array[DataPathColor]

type DataPathValueList = js.Array[DataPathValue]

type DataSetArnsList = js.Array[Arn]

type DataSetConfigurationList = js.Array[DataSetConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_SOLE_OWNER
  - typings.awsSdk.awsSdkStrings.DATASET_NAME
  - java.lang.String
*/
type DataSetFilterAttribute = _DataSetFilterAttribute | java.lang.String

type DataSetIdentifier = java.lang.String

type DataSetIdentifierDeclarationList = js.Array[DataSetIdentifierDeclaration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPICE
  - typings.awsSdk.awsSdkStrings.DIRECT_QUERY
  - java.lang.String
*/
type DataSetImportMode = _DataSetImportMode | java.lang.String

type DataSetName = java.lang.String

type DataSetReferenceList = js.Array[DataSetReference]

type DataSetSearchFilterList = js.Array[DataSetSearchFilter]

type DataSetSummaryList = js.Array[DataSetSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.COPY_SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
  - typings.awsSdk.awsSdkStrings.UNKNOWN_HOST
  - typings.awsSdk.awsSdkStrings.GENERIC_SQL_FAILURE
  - typings.awsSdk.awsSdkStrings.CONFLICT
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type DataSourceErrorInfoType = _DataSourceErrorInfoType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_SOLE_OWNER
  - typings.awsSdk.awsSdkStrings.DATASOURCE_NAME
  - java.lang.String
*/
type DataSourceFilterAttribute = _DataSourceFilterAttribute | java.lang.String

type DataSourceList = js.Array[DataSource]

type DataSourceParametersList = js.Array[DataSourceParameters]

type DataSourceSearchFilterList = js.Array[DataSourceSearchFilter]

type DataSourceSummaryList = js.Array[DataSourceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADOBE_ANALYTICS
  - typings.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
  - typings.awsSdk.awsSdkStrings.ATHENA
  - typings.awsSdk.awsSdkStrings.AURORA
  - typings.awsSdk.awsSdkStrings.AURORA_POSTGRESQL
  - typings.awsSdk.awsSdkStrings.AWS_IOT_ANALYTICS
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.JIRA
  - typings.awsSdk.awsSdkStrings.MARIADB
  - typings.awsSdk.awsSdkStrings.MYSQL
  - typings.awsSdk.awsSdkStrings.ORACLE
  - typings.awsSdk.awsSdkStrings.POSTGRESQL
  - typings.awsSdk.awsSdkStrings.PRESTO
  - typings.awsSdk.awsSdkStrings.REDSHIFT
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.SALESFORCE
  - typings.awsSdk.awsSdkStrings.SERVICENOW
  - typings.awsSdk.awsSdkStrings.SNOWFLAKE
  - typings.awsSdk.awsSdkStrings.SPARK
  - typings.awsSdk.awsSdkStrings.SQLSERVER
  - typings.awsSdk.awsSdkStrings.TERADATA
  - typings.awsSdk.awsSdkStrings.TWITTER
  - typings.awsSdk.awsSdkStrings.TIMESTREAM
  - typings.awsSdk.awsSdkStrings.AMAZON_OPENSEARCH
  - typings.awsSdk.awsSdkStrings.EXASOL
  - typings.awsSdk.awsSdkStrings.DATABRICKS
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

type Database = java.lang.String

type DatasetParameterId = java.lang.String

type DatasetParameterList = js.Array[DatasetParameter]

type DatasetParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_VALUED
  - typings.awsSdk.awsSdkStrings.SINGLE_VALUED
  - java.lang.String
*/
type DatasetParameterValueType = _DatasetParameterValueType | java.lang.String

type Datasets = js.Array[DatasetMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MAX
  - java.lang.String
*/
type DateAggregationFunction = _DateAggregationFunction | java.lang.String

type DateTimeDatasetParameterDefaultValue = js.Date

type DateTimeDatasetParameterValueList = js.Array[js.Date]

type DateTimeDefaultValueList = js.Array[js.Date]

type DateTimeFormat = java.lang.String

type DateTimeParameterList = js.Array[DateTimeParameter]

type DayOfMonth = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUNDAY
  - typings.awsSdk.awsSdkStrings.MONDAY
  - typings.awsSdk.awsSdkStrings.TUESDAY
  - typings.awsSdk.awsSdkStrings.WEDNESDAY
  - typings.awsSdk.awsSdkStrings.THURSDAY
  - typings.awsSdk.awsSdkStrings.FRIDAY
  - typings.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | java.lang.String

type DecimalDatasetParameterDefaultValue = scala.Double

type DecimalDatasetParameterValueList = js.Array[DecimalDatasetParameterDefaultValue]

type DecimalDefaultValueList = js.Array[SensitiveDoubleObject]

type DecimalParameterList = js.Array[DecimalParameter]

type DecimalPlaces = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - java.lang.String
*/
type DefaultAggregation = _DefaultAggregation | java.lang.String

type Delimiter = java.lang.String

type DimensionFieldList = js.Array[DimensionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.PERCENT
  - typings.awsSdk.awsSdkStrings.CURRENCY
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.STRING
  - java.lang.String
*/
type DisplayFormat = _DisplayFormat | java.lang.String

type DnsResolverList = js.Array[IPv4Address]

type Domain = java.lang.String

type Double = scala.Double

type DrillDownFilterList = js.Array[DrillDownFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.ENTERPRISE
  - typings.awsSdk.awsSdkStrings.ENTERPRISE_AND_Q
  - java.lang.String
*/
type Edition = _Edition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.ANONYMOUS
  - java.lang.String
*/
type EmbeddingIdentityType = _EmbeddingIdentityType | java.lang.String

type EmbeddingUrl = java.lang.String

type EntityList = js.Array[Entity]

type EntryPath = java.lang.String

type EntryPoint = java.lang.String

type ExplicitHierarchyColumnList = js.Array[ColumnIdentifier]

type Expression = java.lang.String

type FieldFolderDescription = java.lang.String

type FieldFolderMap = StringDictionary[FieldFolder]

type FieldFolderPath = java.lang.String

type FieldId = java.lang.String

type FieldOrderList = js.Array[FieldId]

type FieldSortOptionsList = js.Array[FieldSortOptions]

type FieldValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.TSV
  - typings.awsSdk.awsSdkStrings.CLF
  - typings.awsSdk.awsSdkStrings.ELF
  - typings.awsSdk.awsSdkStrings.XLSX
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type FileFormat = _FileFormat | java.lang.String

type FilledMapConditionalFormattingOptionList = js.Array[FilledMapConditionalFormattingOption]

type FilledMapDimensionFieldList = js.Array[DimensionField]

type FilledMapMeasureFieldList = js.Array[MeasureField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENFORCED_VALUE_FILTER
  - typings.awsSdk.awsSdkStrings.CONDITIONAL_VALUE_FILTER
  - typings.awsSdk.awsSdkStrings.NAMED_VALUE_FILTER
  - java.lang.String
*/
type FilterClass = _FilterClass | java.lang.String

type FilterControlList = js.Array[FilterControl]

type FilterGroupList = js.Array[FilterGroup]

type FilterList = js.Array[Filter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_VALUES
  - typings.awsSdk.awsSdkStrings.NULLS_ONLY
  - typings.awsSdk.awsSdkStrings.NON_NULLS_ONLY
  - java.lang.String
*/
type FilterNullOption = _FilterNullOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.StringEquals_
  - typings.awsSdk.awsSdkStrings.StringLike
  - java.lang.String
*/
type FilterOperator = _FilterOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_VISUALS
  - typings.awsSdk.awsSdkStrings.SELECTED_VISUALS
  - java.lang.String
*/
type FilterVisualScope = _FilterVisualScope | java.lang.String

type FilteredVisualsList = js.Array[ShortRestrictiveResourceId]

type FolderColumnList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PARENT_FOLDER_ARN
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_SOLE_OWNER
  - typings.awsSdk.awsSdkStrings.DIRECT_QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_OWNER
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT_VIEWER_OR_OWNER
  - typings.awsSdk.awsSdkStrings.FOLDER_NAME
  - java.lang.String
*/
type FolderFilterAttribute = _FolderFilterAttribute | java.lang.String

type FolderMemberList = js.Array[MemberIdArnPair]

type FolderName = java.lang.String

type FolderSearchFilterList = js.Array[FolderSearchFilter]

type FolderSummaryList = js.Array[FolderSummary]

type FolderType = SHARED | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNDERLINE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FontDecoration = _FontDecoration | java.lang.String

type FontList = js.Array[Font]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NORMAL
  - typings.awsSdk.awsSdkStrings.ITALIC
  - java.lang.String
*/
type FontStyle = _FontStyle | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NORMAL
  - typings.awsSdk.awsSdkStrings.BOLD
  - java.lang.String
*/
type FontWeightName = _FontWeightName | java.lang.String

type ForecastComputationCustomSeasonalityValue = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ForecastComputationSeasonality = _ForecastComputationSeasonality | java.lang.String

type ForecastConfigurationList = js.Array[ForecastConfiguration]

type FreeFromLayoutElementList = js.Array[FreeFormLayoutElement]

type FunnelChartDimensionFieldList = js.Array[DimensionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALUE_ONLY
  - typings.awsSdk.awsSdkStrings.PERCENTAGE_BY_FIRST_STAGE
  - typings.awsSdk.awsSdkStrings.PERCENTAGE_BY_PREVIOUS_STAGE
  - typings.awsSdk.awsSdkStrings.VALUE_AND_PERCENTAGE_BY_FIRST_STAGE
  - typings.awsSdk.awsSdkStrings.VALUE_AND_PERCENTAGE_BY_PREVIOUS_STAGE
  - java.lang.String
*/
type FunnelChartMeasureDataLabelStyle = _FunnelChartMeasureDataLabelStyle | java.lang.String

type FunnelChartMeasureFieldList = js.Array[MeasureField]

type GaugeChartConditionalFormattingOptionList = js.Array[GaugeChartConditionalFormattingOption]

type GeoSpatialCountryCode = US | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNTRY
  - typings.awsSdk.awsSdkStrings.STATE
  - typings.awsSdk.awsSdkStrings.COUNTY
  - typings.awsSdk.awsSdkStrings.CITY
  - typings.awsSdk.awsSdkStrings.POSTCODE
  - typings.awsSdk.awsSdkStrings.LONGITUDE
  - typings.awsSdk.awsSdkStrings.LATITUDE
  - java.lang.String
*/
type GeoSpatialDataRole = _GeoSpatialDataRole | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POINT
  - typings.awsSdk.awsSdkStrings.CLUSTER
  - java.lang.String
*/
type GeospatialSelectedPointStyle = _GeospatialSelectedPointStyle | java.lang.String

type GradientStopList = js.Array[GradientStop]

type GridLayoutElementColumnIndex = scala.Double

type GridLayoutElementColumnSpan = scala.Double

type GridLayoutElementList = js.Array[GridLayoutElement]

type GridLayoutElementRowIndex = scala.Double

type GridLayoutElementRowSpan = scala.Double

type GroupDescription = java.lang.String

type GroupFilterAttribute = GROUP_NAME | java.lang.String

type GroupFilterOperator = StartsWith | java.lang.String

type GroupList = js.Array[Group]

type GroupMemberList = js.Array[GroupMember]

type GroupMemberName = java.lang.String

type GroupName = java.lang.String

type GroupSearchFilterList = js.Array[GroupSearchFilter]

type GroupsList = js.Array[String]

type GrowthRatePeriodSize = scala.Double

type HeaderFooterSectionConfigurationList = js.Array[HeaderFooterSectionConfiguration]

type HeatMapDimensionFieldList = js.Array[DimensionField]

type HeatMapMeasureFieldList = js.Array[MeasureField]

type HexColor = java.lang.String

type HexColorWithTransparency = java.lang.String

type HierarchyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BIN_COUNT
  - typings.awsSdk.awsSdkStrings.BIN_WIDTH
  - java.lang.String
*/
type HistogramBinType = _HistogramBinType | java.lang.String

type HistogramMeasureFieldList = js.Array[MeasureField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.CENTER
  - typings.awsSdk.awsSdkStrings.RIGHT
  - typings.awsSdk.awsSdkStrings.AUTO
  - java.lang.String
*/
type HorizontalTextAlignment = _HorizontalTextAlignment | java.lang.String

type Host = java.lang.String

type IAMPolicyAssignmentName = java.lang.String

type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]

type IPv4Address = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CARET_UP
  - typings.awsSdk.awsSdkStrings.CARET_DOWN
  - typings.awsSdk.awsSdkStrings.PLUS
  - typings.awsSdk.awsSdkStrings.MINUS
  - typings.awsSdk.awsSdkStrings.ARROW_UP
  - typings.awsSdk.awsSdkStrings.ARROW_DOWN
  - typings.awsSdk.awsSdkStrings.ARROW_LEFT
  - typings.awsSdk.awsSdkStrings.ARROW_UP_LEFT
  - typings.awsSdk.awsSdkStrings.ARROW_DOWN_LEFT
  - typings.awsSdk.awsSdkStrings.ARROW_RIGHT
  - typings.awsSdk.awsSdkStrings.ARROW_UP_RIGHT
  - typings.awsSdk.awsSdkStrings.ARROW_DOWN_RIGHT
  - typings.awsSdk.awsSdkStrings.FACE_UP
  - typings.awsSdk.awsSdkStrings.FACE_DOWN
  - typings.awsSdk.awsSdkStrings.FACE_FLAT
  - typings.awsSdk.awsSdkStrings.ONE_BAR
  - typings.awsSdk.awsSdkStrings.TWO_BAR
  - typings.awsSdk.awsSdkStrings.THREE_BAR
  - typings.awsSdk.awsSdkStrings.CIRCLE
  - typings.awsSdk.awsSdkStrings.TRIANGLE
  - typings.awsSdk.awsSdkStrings.SQUARE
  - typings.awsSdk.awsSdkStrings.FLAG
  - typings.awsSdk.awsSdkStrings.THUMBS_UP
  - typings.awsSdk.awsSdkStrings.THUMBS_DOWN
  - typings.awsSdk.awsSdkStrings.CHECKMARK
  - typings.awsSdk.awsSdkStrings.X
  - java.lang.String
*/
type Icon = _Icon | java.lang.String

type IdentityMap = StringDictionary[IdentityNameList]

type IdentityName = java.lang.String

type IdentityNameList = js.Array[IdentityName]

type IdentityStore = QUICKSIGHT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILURE_TO_ASSUME_ROLE
  - typings.awsSdk.awsSdkStrings.INGESTION_SUPERSEDED
  - typings.awsSdk.awsSdkStrings.INGESTION_CANCELED
  - typings.awsSdk.awsSdkStrings.DATA_SET_DELETED
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_SPICE
  - typings.awsSdk.awsSdkStrings.S3_UPLOADED_FILE_DELETED
  - typings.awsSdk.awsSdkStrings.S3_MANIFEST_ERROR
  - typings.awsSdk.awsSdkStrings.DATA_TOLERANCE_EXCEPTION
  - typings.awsSdk.awsSdkStrings.SPICE_TABLE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_SIZE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ROW_SIZE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ACCOUNT_CAPACITY_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.CUSTOMER_ERROR
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_NOT_AVAILABLE
  - typings.awsSdk.awsSdkStrings.CONNECTION_FAILURE
  - typings.awsSdk.awsSdkStrings.SQL_TABLE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typings.awsSdk.awsSdkStrings.SSL_CERTIFICATE_VALIDATION_FAILURE
  - typings.awsSdk.awsSdkStrings.OAUTH_TOKEN_FAILURE
  - typings.awsSdk.awsSdkStrings.SOURCE_API_LIMIT_EXCEEDED_FAILURE
  - typings.awsSdk.awsSdkStrings.PASSWORD_AUTHENTICATION_FAILURE
  - typings.awsSdk.awsSdkStrings.SQL_SCHEMA_MISMATCH_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_DATE_FORMAT
  - typings.awsSdk.awsSdkStrings.INVALID_DATAPREP_SYNTAX
  - typings.awsSdk.awsSdkStrings.SOURCE_RESOURCE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.SQL_INVALID_PARAMETER_VALUE
  - typings.awsSdk.awsSdkStrings.QUERY_TIMEOUT
  - typings.awsSdk.awsSdkStrings.SQL_NUMERIC_OVERFLOW
  - typings.awsSdk.awsSdkStrings.UNRESOLVABLE_HOST
  - typings.awsSdk.awsSdkStrings.UNROUTABLE_HOST
  - typings.awsSdk.awsSdkStrings.SQL_EXCEPTION
  - typings.awsSdk.awsSdkStrings.S3_FILE_INACCESSIBLE
  - typings.awsSdk.awsSdkStrings.IOT_FILE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IOT_DATA_SET_FILE_EMPTY
  - typings.awsSdk.awsSdkStrings.INVALID_DATA_SOURCE_CONFIG
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_AUTH_FAILED
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_CONNECTION_FAILED
  - typings.awsSdk.awsSdkStrings.FAILURE_TO_PROCESS_JSON_FILE
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.REFRESH_SUPPRESSED_BY_EDIT
  - typings.awsSdk.awsSdkStrings.PERMISSION_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ELASTICSEARCH_CURSOR_NOT_ENABLED
  - typings.awsSdk.awsSdkStrings.CURSOR_NOT_ENABLED
  - typings.awsSdk.awsSdkStrings.DUPLICATE_COLUMN_NAMES_FOUND
  - java.lang.String
*/
type IngestionErrorType = _IngestionErrorType | java.lang.String

type IngestionId = java.lang.String

type IngestionMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANUAL
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type IngestionRequestSource = _IngestionRequestSource | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIAL_INGESTION
  - typings.awsSdk.awsSdkStrings.EDIT
  - typings.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typings.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionRequestType = _IngestionRequestType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type IngestionStatus = _IngestionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typings.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionType = _IngestionType | java.lang.String

type Ingestions = js.Array[Ingestion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DATETIME
  - typings.awsSdk.awsSdkStrings.BIT
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type InputColumnDataType = _InputColumnDataType | java.lang.String

type InputColumnList = js.Array[InputColumn]

type InstanceId = java.lang.String

type Integer = scala.Double

type IntegerDatasetParameterDefaultValue = scala.Double

type IntegerDatasetParameterValueList = js.Array[IntegerDatasetParameterDefaultValue]

type IntegerDefaultValueList = js.Array[SensitiveLongObject]

type IntegerParameterList = js.Array[IntegerParameter]

type IpRestrictionRuleDescription = java.lang.String

type IpRestrictionRuleMap = StringDictionary[IpRestrictionRuleDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INNER
  - typings.awsSdk.awsSdkStrings.OUTER
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.RIGHT
  - java.lang.String
*/
type JoinType = _JoinType | java.lang.String

type KPIConditionalFormattingOptionList = js.Array[KPIConditionalFormattingOption]

type Latitude = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VISUAL
  - typings.awsSdk.awsSdkStrings.FILTER_CONTROL
  - typings.awsSdk.awsSdkStrings.PARAMETER_CONTROL
  - typings.awsSdk.awsSdkStrings.TEXT_BOX
  - java.lang.String
*/
type LayoutElementType = _LayoutElementType | java.lang.String

type LayoutList = js.Array[Layout]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.RIGHT
  - typings.awsSdk.awsSdkStrings.BOTTOM
  - typings.awsSdk.awsSdkStrings.TOP
  - java.lang.String
*/
type LegendPosition = _LegendPosition | java.lang.String

type Length = java.lang.String

type LimitedString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOLID
  - typings.awsSdk.awsSdkStrings.DOTTED
  - typings.awsSdk.awsSdkStrings.DASHED
  - java.lang.String
*/
type LineChartLineStyle = _LineChartLineStyle | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CIRCLE
  - typings.awsSdk.awsSdkStrings.TRIANGLE
  - typings.awsSdk.awsSdkStrings.SQUARE
  - typings.awsSdk.awsSdkStrings.DIAMOND
  - typings.awsSdk.awsSdkStrings.ROUNDED_SQUARE
  - java.lang.String
*/
type LineChartMarkerShape = _LineChartMarkerShape | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINE
  - typings.awsSdk.awsSdkStrings.AREA
  - typings.awsSdk.awsSdkStrings.STACKED_AREA
  - java.lang.String
*/
type LineChartType = _LineChartType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINEAR
  - typings.awsSdk.awsSdkStrings.SMOOTH
  - typings.awsSdk.awsSdkStrings.STEPPED
  - java.lang.String
*/
type LineInterpolation = _LineInterpolation | java.lang.String

type LogicalTableAlias = java.lang.String

type LogicalTableId = java.lang.String

type LogicalTableMap = StringDictionary[LogicalTable]

type Long = scala.Double

type LongPlainText = java.lang.String

type LongRichText = java.lang.String

type Longitude = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.WEEK
  - java.lang.String
*/
type LookbackWindowSizeUnit = _LookbackWindowSizeUnit | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type MapZoomMode = _MapZoomMode | java.lang.String

type MappedDataSetParameters = js.Array[MappedDataSetParameter]

type MaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MAXIMUM
  - typings.awsSdk.awsSdkStrings.MINIMUM
  - java.lang.String
*/
type MaximumMinimumComputationType = _MaximumMinimumComputationType | java.lang.String

type MeasureFieldList = js.Array[MeasureField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DASHBOARD
  - typings.awsSdk.awsSdkStrings.ANALYSIS
  - typings.awsSdk.awsSdkStrings.DATASET
  - java.lang.String
*/
type MemberType = _MemberType | java.lang.String

type MissingDataConfigurationList = js.Array[MissingDataConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERPOLATE
  - typings.awsSdk.awsSdkStrings.SHOW_AS_ZERO
  - typings.awsSdk.awsSdkStrings.SHOW_AS_BLANK
  - java.lang.String
*/
type MissingDataTreatmentOption = _MissingDataTreatmentOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.STDEV
  - typings.awsSdk.awsSdkStrings.STDEVP
  - typings.awsSdk.awsSdkStrings.VAR
  - typings.awsSdk.awsSdkStrings.VARP
  - typings.awsSdk.awsSdkStrings.PERCENTILE
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type NamedEntityAggType = _NamedEntityAggType | java.lang.String

type NamedEntityDefinitions = js.Array[NamedEntityDefinition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_AGGREGATION
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.STDEV
  - typings.awsSdk.awsSdkStrings.STDEVP
  - typings.awsSdk.awsSdkStrings.VAR
  - typings.awsSdk.awsSdkStrings.VARP
  - java.lang.String
*/
type NamedFilterAggType = _NamedFilterAggType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CATEGORY_FILTER
  - typings.awsSdk.awsSdkStrings.NUMERIC_EQUALITY_FILTER
  - typings.awsSdk.awsSdkStrings.NUMERIC_RANGE_FILTER
  - typings.awsSdk.awsSdkStrings.DATE_RANGE_FILTER
  - typings.awsSdk.awsSdkStrings.RELATIVE_DATE_FILTER
  - java.lang.String
*/
type NamedFilterType = _NamedFilterType | java.lang.String

type Namespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type NamespaceErrorType = _NamespaceErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.RETRYABLE_FAILURE
  - typings.awsSdk.awsSdkStrings.NON_RETRYABLE_FAILURE
  - java.lang.String
*/
type NamespaceStatus = _NamespaceStatus | java.lang.String

type Namespaces = js.Array[NamespaceInfoV2]

type NarrativeString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POSITIVE
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - java.lang.String
*/
type NegativeValueDisplayMode = _NegativeValueDisplayMode | java.lang.String

type NetworkInterfaceId = java.lang.String

type NetworkInterfaceList = js.Array[NetworkInterface]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETION_FAILED
  - typings.awsSdk.awsSdkStrings.DELETION_SCHEDULED
  - typings.awsSdk.awsSdkStrings.ATTACHMENT_FAILED_ROLLBACK_FAILED
  - java.lang.String
*/
type NetworkInterfaceStatus = _NetworkInterfaceStatus | java.lang.String

type NonEmptyString = java.lang.String

type NullString = java.lang.String

type NullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.THOUSANDS
  - typings.awsSdk.awsSdkStrings.MILLIONS
  - typings.awsSdk.awsSdkStrings.BILLIONS
  - typings.awsSdk.awsSdkStrings.TRILLIONS
  - java.lang.String
*/
type NumberScale = _NumberScale | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.DOES_NOT_EQUAL
  - java.lang.String
*/
type NumericEqualityMatchOperator = _NumericEqualityMatchOperator | java.lang.String

type NumericFilterSelectAllOptions = FILTER_ALL_VALUES | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMMA
  - typings.awsSdk.awsSdkStrings.DOT
  - typings.awsSdk.awsSdkStrings.SPACE
  - java.lang.String
*/
type NumericSeparatorSymbol = _NumericSeparatorSymbol | java.lang.String

type OnClause = java.lang.String

type OptionalPort = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCLUDE
  - typings.awsSdk.awsSdkStrings.EXCLUDE
  - java.lang.String
*/
type OtherCategories = _OtherCategories | java.lang.String

type OutputColumnList = js.Array[OutputColumn]

type PageNumber = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOLID
  - typings.awsSdk.awsSdkStrings.DASHED
  - typings.awsSdk.awsSdkStrings.DOTTED
  - java.lang.String
*/
type PanelBorderStyle = _PanelBorderStyle | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PORTRAIT
  - typings.awsSdk.awsSdkStrings.LANDSCAPE
  - java.lang.String
*/
type PaperOrientation = _PaperOrientation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.US_LETTER
  - typings.awsSdk.awsSdkStrings.US_LEGAL
  - typings.awsSdk.awsSdkStrings.US_TABLOID_LEDGER
  - typings.awsSdk.awsSdkStrings.A0
  - typings.awsSdk.awsSdkStrings.A1
  - typings.awsSdk.awsSdkStrings.A2
  - typings.awsSdk.awsSdkStrings.A3
  - typings.awsSdk.awsSdkStrings.A4
  - typings.awsSdk.awsSdkStrings.A5
  - typings.awsSdk.awsSdkStrings.JIS_B4
  - typings.awsSdk.awsSdkStrings.JIS_B5
  - java.lang.String
*/
type PaperSize = _PaperSize | java.lang.String

type ParameterControlList = js.Array[ParameterControl]

type ParameterDeclarationList = js.Array[ParameterDeclaration]

type ParameterName = java.lang.String

type ParameterSelectableValueList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_VALUED
  - typings.awsSdk.awsSdkStrings.SINGLE_VALUED
  - java.lang.String
*/
type ParameterValueType = _ParameterValueType | java.lang.String

type Password = java.lang.String

type Path = js.Array[Arn]

type PercentNumber = scala.Double

type PercentileValue = scala.Double

type PeriodsBackward = scala.Double

type PeriodsForward = scala.Double

type PhysicalTableId = java.lang.String

type PhysicalTableMap = StringDictionary[PhysicalTable]

type PivotFieldSortOptionsList = js.Array[PivotFieldSortOptions]

type PivotMeasureFieldList = js.Array[MeasureField]

type PivotTableConditionalFormattingOptionList = js.Array[PivotTableConditionalFormattingOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIELD
  - typings.awsSdk.awsSdkStrings.FIELD_TOTAL
  - typings.awsSdk.awsSdkStrings.GRAND_TOTAL
  - java.lang.String
*/
type PivotTableConditionalFormattingScopeRole = _PivotTableConditionalFormattingScopeRole | java.lang.String

type PivotTableDataPathOptionList = js.Array[PivotTableDataPathOption]

type PivotTableDimensionList = js.Array[DimensionField]

type PivotTableFieldOptionList = js.Array[PivotTableFieldOption]

type PivotTableFieldSubtotalOptionsList = js.Array[PivotTableFieldSubtotalOptions]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROW
  - typings.awsSdk.awsSdkStrings.COLUMN
  - java.lang.String
*/
type PivotTableMetricPlacement = _PivotTableMetricPlacement | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.LAST
  - java.lang.String
*/
type PivotTableSubtotalLevel = _PivotTableSubtotalLevel | java.lang.String

type PixelLength = java.lang.String

type Port = scala.Double

type PositiveInteger = scala.Double

type PositiveLong = scala.Double

type PredefinedHierarchyColumnList = js.Array[ColumnIdentifier]

type PredictionInterval = scala.Double

type Prefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HIDDEN
  - typings.awsSdk.awsSdkStrings.COMPARISON
  - typings.awsSdk.awsSdkStrings.ACTUAL
  - java.lang.String
*/
type PrimaryValueDisplayType = _PrimaryValueDisplayType | java.lang.String

type Principal = java.lang.String

type PrincipalList = js.Array[String]

type ProjectedColumnList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIMARY
  - typings.awsSdk.awsSdkStrings.ID
  - java.lang.String
*/
type PropertyRole = _PropertyRole | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INHERIT
  - typings.awsSdk.awsSdkStrings.DIMENSION
  - typings.awsSdk.awsSdkStrings.MEASURE
  - java.lang.String
*/
type PropertyUsage = _PropertyUsage | java.lang.String

type Query = java.lang.String

type RadarChartCategoryFieldList = js.Array[DimensionField]

type RadarChartColorFieldList = js.Array[DimensionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CIRCLE
  - typings.awsSdk.awsSdkStrings.POLYGON
  - java.lang.String
*/
type RadarChartShape = _RadarChartShape | java.lang.String

type RadarChartStartAngle = scala.Double

type RadarChartValuesFieldList = js.Array[MeasureField]

type RecoveryWindowInDays = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.CENTER
  - typings.awsSdk.awsSdkStrings.RIGHT
  - java.lang.String
*/
type ReferenceLineLabelHorizontalPosition = _ReferenceLineLabelHorizontalPosition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ABOVE
  - typings.awsSdk.awsSdkStrings.BELOW
  - java.lang.String
*/
type ReferenceLineLabelVerticalPosition = _ReferenceLineLabelVerticalPosition | java.lang.String

type ReferenceLineList = js.Array[ReferenceLine]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOLID
  - typings.awsSdk.awsSdkStrings.DASHED
  - typings.awsSdk.awsSdkStrings.DOTTED
  - java.lang.String
*/
type ReferenceLinePatternType = _ReferenceLinePatternType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BEFORE_CUSTOM_LABEL
  - typings.awsSdk.awsSdkStrings.AFTER_CUSTOM_LABEL
  - java.lang.String
*/
type ReferenceLineValueLabelRelativePosition = _ReferenceLineValueLabelRelativePosition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MINUTE15
  - typings.awsSdk.awsSdkStrings.MINUTE30
  - typings.awsSdk.awsSdkStrings.HOURLY
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - java.lang.String
*/
type RefreshInterval = _RefreshInterval | java.lang.String

type RefreshSchedules = js.Array[RefreshSchedule]

type RelationalTableCatalog = java.lang.String

type RelationalTableName = java.lang.String

type RelationalTableSchema = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PREVIOUS
  - typings.awsSdk.awsSdkStrings.THIS
  - typings.awsSdk.awsSdkStrings.LAST
  - typings.awsSdk.awsSdkStrings.NOW
  - typings.awsSdk.awsSdkStrings.NEXT
  - java.lang.String
*/
type RelativeDateType = _RelativeDateType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXTRA_SMALL
  - typings.awsSdk.awsSdkStrings.SMALL
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LARGE
  - typings.awsSdk.awsSdkStrings.EXTRA_LARGE
  - java.lang.String
*/
type RelativeFontSize = _RelativeFontSize | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIXED
  - typings.awsSdk.awsSdkStrings.RESPONSIVE
  - java.lang.String
*/
type ResizeOption = _ResizeOption | java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

type ResourcePermissionList = js.Array[ResourcePermission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ResourceStatus = _ResourceStatus | java.lang.String

type RestrictiveResourceId = java.lang.String

type RoleArn = java.lang.String

type RoleName = java.lang.String

type RoleSessionName = java.lang.String

type RowAlternateColorList = js.Array[HexColor]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VERSION_1
  - typings.awsSdk.awsSdkStrings.VERSION_2
  - java.lang.String
*/
type RowLevelPermissionFormatVersion = _RowLevelPermissionFormatVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GRANT_ACCESS
  - typings.awsSdk.awsSdkStrings.DENY_ACCESS
  - java.lang.String
*/
type RowLevelPermissionPolicy = _RowLevelPermissionPolicy | java.lang.String

type RowLevelPermissionTagDelimiter = java.lang.String

type RowLevelPermissionTagRuleConfiguration = js.Array[SessionTagKey]

type RowLevelPermissionTagRuleConfigurationList = js.Array[RowLevelPermissionTagRuleConfiguration]

type RowLevelPermissionTagRuleList = js.Array[RowLevelPermissionTagRule]

type RowSortList = js.Array[FieldSortOptions]

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type Seasonality = scala.Double

type SecretArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type SectionPageBreakStatus = _SectionPageBreakStatus | java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIdList = js.Array[SecurityGroupId]

type SelectAllValueOptions = ALL_VALUES | java.lang.String

type SelectedFieldList = js.Array[FieldId]

type SelectedFieldOptions = ALL_FIELDS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.DETAILED
  - java.lang.String
*/
type SelectedTooltipType = _SelectedTooltipType | java.lang.String

type SensitiveDouble = scala.Double

type SensitiveDoubleList = js.Array[SensitiveDouble]

type SensitiveDoubleObject = scala.Double

type SensitiveLong = scala.Double

type SensitiveLongList = js.Array[SensitiveLong]

type SensitiveLongObject = scala.Double

type SensitiveString = java.lang.String

type SensitiveStringList = js.Array[SensitiveString]

type SensitiveStringObject = java.lang.String

type SensitiveTimestamp = js.Date

type SensitiveTimestampList = js.Array[js.Date]

type SeriesItemList = js.Array[SeriesItem]

type SessionLifetimeInMinutes = scala.Double

type SessionTagKey = java.lang.String

type SessionTagList = js.Array[SessionTag]

type SessionTagValue = java.lang.String

type SetParameterValueConfigurationList = js.Array[SetParameterValueConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PAGINATED
  - typings.awsSdk.awsSdkStrings.INTERACTIVE
  - java.lang.String
*/
type SheetContentType = _SheetContentType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_VALUED
  - typings.awsSdk.awsSdkStrings.DATE_RANGE
  - java.lang.String
*/
type SheetControlDateTimePickerType = _SheetControlDateTimePickerType | java.lang.String

type SheetControlLayoutList = js.Array[SheetControlLayout]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_SELECT
  - typings.awsSdk.awsSdkStrings.SINGLE_SELECT
  - java.lang.String
*/
type SheetControlListType = _SheetControlListType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_POINT
  - typings.awsSdk.awsSdkStrings.RANGE
  - java.lang.String
*/
type SheetControlSliderType = _SheetControlSliderType | java.lang.String

type SheetControlTitle = java.lang.String

type SheetDefinitionList = js.Array[SheetDefinition]

type SheetDescription = java.lang.String

type SheetElementRenderingRuleList = js.Array[SheetElementRenderingRule]

type SheetList = js.Array[Sheet]

type SheetName = java.lang.String

type SheetTextBoxContent = java.lang.String

type SheetTextBoxList = js.Array[SheetTextBox]

type SheetTitle = java.lang.String

type SheetVisualScopingConfigurations = js.Array[SheetVisualScopingConfiguration]

type ShortPlainText = java.lang.String

type ShortRestrictiveResourceId = java.lang.String

type ShortRichText = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.MIN
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.DISTINCT_COUNT
  - typings.awsSdk.awsSdkStrings.VAR
  - typings.awsSdk.awsSdkStrings.VARP
  - typings.awsSdk.awsSdkStrings.STDEV
  - typings.awsSdk.awsSdkStrings.STDEVP
  - typings.awsSdk.awsSdkStrings.MEDIAN
  - java.lang.String
*/
type SimpleNumericalAggregationFunction = _SimpleNumericalAggregationFunction | java.lang.String

type SiteBaseUrl = java.lang.String

type SmallMultiplesDimensionFieldList = js.Array[DimensionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortDirection = _SortDirection | java.lang.String

type SqlEndpointPath = java.lang.String

type SqlQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StatusCode = scala.Double

type String = java.lang.String

type StringDatasetParameterDefaultValue = java.lang.String

type StringDatasetParameterValueList = js.Array[StringDatasetParameterDefaultValue]

type StringDefaultValueList = js.Array[SensitiveStringObject]

type StringList = js.Array[String]

type StringParameterList = js.Array[StringParameter]

type SubnetId = java.lang.String

type SubnetIdList = js.Array[SubnetId]

type Suffix = java.lang.String

type Synonyms = js.Array[LimitedString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SOLID
  - java.lang.String
*/
type TableBorderStyle = _TableBorderStyle | java.lang.String

type TableBorderThickness = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIT_TO_CELL_HEIGHT
  - typings.awsSdk.awsSdkStrings.FIT_TO_CELL_WIDTH
  - typings.awsSdk.awsSdkStrings.DO_NOT_SCALE
  - java.lang.String
*/
type TableCellImageScalingConfiguration = _TableCellImageScalingConfiguration | java.lang.String

type TableConditionalFormattingOptionList = js.Array[TableConditionalFormattingOption]

type TableFieldHeight = scala.Double

type TableFieldIconSetType = LINK | java.lang.String

type TableFieldOptionList = js.Array[TableFieldOption]

type TableInlineVisualizationList = js.Array[TableInlineVisualization]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VERTICAL
  - typings.awsSdk.awsSdkStrings.HORIZONTAL
  - java.lang.String
*/
type TableOrientation = _TableOrientation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START
  - typings.awsSdk.awsSdkStrings.END
  - java.lang.String
*/
type TableTotalsPlacement = _TableTotalsPlacement | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PINNED
  - typings.awsSdk.awsSdkStrings.SCROLLED
  - java.lang.String
*/
type TableTotalsScrollStatus = _TableTotalsScrollStatus | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetVisualList = js.Array[ShortRestrictiveResourceId]

type TargetVisualOptions = ALL_VISUALS | java.lang.String

type TemplateAliasList = js.Array[TemplateAlias]

type TemplateErrorList = js.Array[TemplateError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - java.lang.String
*/
type TemplateErrorType = _TemplateErrorType | java.lang.String

type TemplateName = java.lang.String

type TemplateSummaryList = js.Array[TemplateSummary]

type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]

type TextAreaControlDelimiter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOUBLE_QUOTE
  - typings.awsSdk.awsSdkStrings.SINGLE_QUOTE
  - java.lang.String
*/
type TextQualifier = _TextQualifier | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.WRAP
  - java.lang.String
*/
type TextWrap = _TextWrap | java.lang.String

type ThemeAliasList = js.Array[ThemeAlias]

type ThemeErrorList = js.Array[ThemeError]

type ThemeErrorType = INTERNAL_FAILURE | java.lang.String

type ThemeName = java.lang.String

type ThemeSummaryList = js.Array[ThemeSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ThemeType = _ThemeType | java.lang.String

type ThemeVersionSummaryList = js.Array[ThemeVersionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.YEAR
  - typings.awsSdk.awsSdkStrings.QUARTER
  - typings.awsSdk.awsSdkStrings.MONTH
  - typings.awsSdk.awsSdkStrings.WEEK
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.MINUTE
  - typings.awsSdk.awsSdkStrings.SECOND
  - typings.awsSdk.awsSdkStrings.MILLISECOND
  - java.lang.String
*/
type TimeGranularity = _TimeGranularity | java.lang.String

type Timestamp = js.Date

type TooltipItemList = js.Array[TooltipItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.PRIMARY_VALUE
  - java.lang.String
*/
type TooltipTitleType = _TooltipTitleType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TOP
  - typings.awsSdk.awsSdkStrings.BOTTOM
  - java.lang.String
*/
type TopBottomComputationType = _TopBottomComputationType | java.lang.String

type TopBottomMoversComputationMoverSize = scala.Double

type TopBottomRankedComputationResultSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERCENT_DIFFERENCE
  - typings.awsSdk.awsSdkStrings.ABSOLUTE_DIFFERENCE
  - java.lang.String
*/
type TopBottomSortOrder = _TopBottomSortOrder | java.lang.String

type TopicCalculatedFields = js.Array[TopicCalculatedField]

type TopicColumns = js.Array[TopicColumn]

type TopicFilters = js.Array[TopicFilter]

type TopicId = java.lang.String

type TopicNamedEntities = js.Array[TopicNamedEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMMA
  - typings.awsSdk.awsSdkStrings.DOT
  - java.lang.String
*/
type TopicNumericSeparatorSymbol = _TopicNumericSeparatorSymbol | java.lang.String

type TopicRefreshScheduleSummaries = js.Array[TopicRefreshScheduleSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type TopicRefreshStatus = _TopicRefreshStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PREVIOUS
  - typings.awsSdk.awsSdkStrings.THIS
  - typings.awsSdk.awsSdkStrings.LAST
  - typings.awsSdk.awsSdkStrings.NEXT
  - typings.awsSdk.awsSdkStrings.NOW
  - java.lang.String
*/
type TopicRelativeDateFilterFunction = _TopicRelativeDateFilterFunction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOURLY
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - java.lang.String
*/
type TopicScheduleType = _TopicScheduleType | java.lang.String

type TopicSummaries = js.Array[TopicSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SECOND
  - typings.awsSdk.awsSdkStrings.MINUTE
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.WEEK
  - typings.awsSdk.awsSdkStrings.MONTH
  - typings.awsSdk.awsSdkStrings.QUARTER
  - typings.awsSdk.awsSdkStrings.YEAR
  - java.lang.String
*/
type TopicTimeGranularity = _TopicTimeGranularity | java.lang.String

type TransformOperationList = js.Array[TransformOperation]

type TreeMapDimensionFieldList = js.Array[DimensionField]

type TreeMapMeasureFieldList = js.Array[MeasureField]

type TypeCastFormat = java.lang.String

type TypeParameters = StringDictionary[LimitedString]

type URLOperationTemplate = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW_TAB
  - typings.awsSdk.awsSdkStrings.NEW_WINDOW
  - typings.awsSdk.awsSdkStrings.SAME_TAB
  - java.lang.String
*/
type URLTargetConfiguration = _URLTargetConfiguration | java.lang.String

type UnaggregatedFieldList = js.Array[UnaggregatedField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEAST
  - typings.awsSdk.awsSdkStrings.MOST
  - java.lang.String
*/
type UndefinedSpecifiedValueType = _UndefinedSpecifiedValueType | java.lang.String

type UnicodeIcon = java.lang.String

type UnlimitedPixelLength = java.lang.String

type UpdateLinkPermissionList = js.Array[ResourcePermission]

type UpdateResourcePermissionList = js.Array[ResourcePermission]

type UserList = js.Array[User]

type UserName_ = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADMIN
  - typings.awsSdk.awsSdkStrings.AUTHOR
  - typings.awsSdk.awsSdkStrings.READER
  - typings.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
  - typings.awsSdk.awsSdkStrings.RESTRICTED_READER
  - java.lang.String
*/
type UserRole = _UserRole | java.lang.String

type Username = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.PARTIALLY_AVAILABLE
  - java.lang.String
*/
type VPCConnectionAvailabilityStatus = _VPCConnectionAvailabilityStatus | java.lang.String

type VPCConnectionResourceIdRestricted = java.lang.String

type VPCConnectionResourceIdUnrestricted = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETION_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VPCConnectionResourceStatus = _VPCConnectionResourceStatus | java.lang.String

type VPCConnectionSummaryList = js.Array[VPCConnectionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECOMMENDED_VALUE
  - typings.awsSdk.awsSdkStrings.NULL
  - java.lang.String
*/
type ValueWhenUnsetOption = _ValueWhenUnsetOption | java.lang.String

type VersionDescription = java.lang.String

type VersionNumber = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TOP
  - typings.awsSdk.awsSdkStrings.MIDDLE
  - typings.awsSdk.awsSdkStrings.BOTTOM
  - java.lang.String
*/
type VerticalTextAlignment = _VerticalTextAlignment | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HIDDEN
  - typings.awsSdk.awsSdkStrings.VISIBLE
  - java.lang.String
*/
type Visibility = _Visibility | java.lang.String

type VisiblePanelColumns = scala.Double

type VisiblePanelRows = scala.Double

type VisualCustomActionList = js.Array[VisualCustomAction]

type VisualCustomActionName = java.lang.String

type VisualCustomActionOperationList = js.Array[VisualCustomActionOperation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATA_POINT_CLICK
  - typings.awsSdk.awsSdkStrings.DATA_POINT_MENU
  - java.lang.String
*/
type VisualCustomActionTrigger = _VisualCustomActionTrigger | java.lang.String

type VisualList = js.Array[Visual]

type Warehouse = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type WidgetStatus = _WidgetStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FLUID
  - typings.awsSdk.awsSdkStrings.NORMAL
  - java.lang.String
*/
type WordCloudCloudLayout = _WordCloudCloudLayout | java.lang.String

type WordCloudDimensionFieldList = js.Array[DimensionField]

type WordCloudMaximumStringLength = scala.Double

type WordCloudMeasureFieldList = js.Array[MeasureField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOWER_CASE
  - typings.awsSdk.awsSdkStrings.EXISTING_CASE
  - java.lang.String
*/
type WordCloudWordCasing = _WordCloudWordCasing | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HORIZONTAL
  - typings.awsSdk.awsSdkStrings.HORIZONTAL_AND_VERTICAL
  - java.lang.String
*/
type WordCloudWordOrientation = _WordCloudWordOrientation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SMALL
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LARGE
  - java.lang.String
*/
type WordCloudWordPadding = _WordCloudWordPadding | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMPHASIZE
  - typings.awsSdk.awsSdkStrings.NORMAL
  - java.lang.String
*/
type WordCloudWordScaling = _WordCloudWordScaling | java.lang.String

type WorkGroup = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-04-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
