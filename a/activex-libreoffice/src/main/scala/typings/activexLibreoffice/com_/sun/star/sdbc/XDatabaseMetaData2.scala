package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the {@link XDatabaseMetaData} interface to allow retrieval of additional information. */
trait XDatabaseMetaData2
  extends StObject
     with XDatabaseMetaData {
  
  /**
    * complements {@link XDatabaseMetaData.getURL} by returning the settings which, upon construction of the connection, have been used besides the
    * connection URL.
    * @see XDriver.connect
    */
  val ConnectionInfo: SafeArray[PropertyValue]
  
  /**
    * complements {@link XDatabaseMetaData.getURL} by returning the settings which, upon construction of the connection, have been used besides the
    * connection URL.
    * @see XDriver.connect
    */
  def getConnectionInfo(): SafeArray[PropertyValue]
}
object XDatabaseMetaData2 {
  
  @scala.inline
  def apply(
    CatalogSeparator: String,
    CatalogTerm: String,
    Catalogs: XResultSet,
    Connection: XConnection,
    ConnectionInfo: SafeArray[PropertyValue],
    DatabaseProductName: String,
    DatabaseProductVersion: String,
    DefaultTransactionIsolation: Double,
    DriverMajorVersion: Double,
    DriverMinorVersion: Double,
    DriverName: String,
    DriverVersion: String,
    ExtraNameCharacters: String,
    IdentifierQuoteString: String,
    MaxBinaryLiteralLength: Double,
    MaxCatalogNameLength: Double,
    MaxCharLiteralLength: Double,
    MaxColumnNameLength: Double,
    MaxColumnsInGroupBy: Double,
    MaxColumnsInIndex: Double,
    MaxColumnsInOrderBy: Double,
    MaxColumnsInSelect: Double,
    MaxColumnsInTable: Double,
    MaxConnections: Double,
    MaxCursorNameLength: Double,
    MaxIndexLength: Double,
    MaxProcedureNameLength: Double,
    MaxRowSize: Double,
    MaxSchemaNameLength: Double,
    MaxStatementLength: Double,
    MaxStatements: Double,
    MaxTableNameLength: Double,
    MaxTablesInSelect: Double,
    MaxUserNameLength: Double,
    NumericFunctions: String,
    ProcedureTerm: String,
    SQLKeywords: String,
    SchemaTerm: String,
    Schemas: XResultSet,
    SearchStringEscape: String,
    StringFunctions: String,
    SystemFunctions: String,
    TableTypes: XResultSet,
    TimeDateFunctions: String,
    TypeInfo: XResultSet,
    URL: String,
    UserName: String,
    acquire: () => Unit,
    allProceduresAreCallable: () => Boolean,
    allTablesAreSelectable: () => Boolean,
    dataDefinitionCausesTransactionCommit: () => Boolean,
    dataDefinitionIgnoredInTransactions: () => Boolean,
    deletesAreDetected: Double => Boolean,
    doesMaxRowSizeIncludeBlobs: () => Boolean,
    getBestRowIdentifier: (js.Any, String, String, Double, Boolean) => XResultSet,
    getCatalogSeparator: () => String,
    getCatalogTerm: () => String,
    getCatalogs: () => XResultSet,
    getColumnPrivileges: (js.Any, String, String, String) => XResultSet,
    getColumns: (js.Any, String, String, String) => XResultSet,
    getConnection: () => XConnection,
    getConnectionInfo: () => SafeArray[PropertyValue],
    getCrossReference: (js.Any, String, String, js.Any, String, String) => XResultSet,
    getDatabaseProductName: () => String,
    getDatabaseProductVersion: () => String,
    getDefaultTransactionIsolation: () => Double,
    getDriverMajorVersion: () => Double,
    getDriverMinorVersion: () => Double,
    getDriverName: () => String,
    getDriverVersion: () => String,
    getExportedKeys: (js.Any, String, String) => XResultSet,
    getExtraNameCharacters: () => String,
    getIdentifierQuoteString: () => String,
    getImportedKeys: (js.Any, String, String) => XResultSet,
    getIndexInfo: (js.Any, String, String, Boolean, Boolean) => XResultSet,
    getMaxBinaryLiteralLength: () => Double,
    getMaxCatalogNameLength: () => Double,
    getMaxCharLiteralLength: () => Double,
    getMaxColumnNameLength: () => Double,
    getMaxColumnsInGroupBy: () => Double,
    getMaxColumnsInIndex: () => Double,
    getMaxColumnsInOrderBy: () => Double,
    getMaxColumnsInSelect: () => Double,
    getMaxColumnsInTable: () => Double,
    getMaxConnections: () => Double,
    getMaxCursorNameLength: () => Double,
    getMaxIndexLength: () => Double,
    getMaxProcedureNameLength: () => Double,
    getMaxRowSize: () => Double,
    getMaxSchemaNameLength: () => Double,
    getMaxStatementLength: () => Double,
    getMaxStatements: () => Double,
    getMaxTableNameLength: () => Double,
    getMaxTablesInSelect: () => Double,
    getMaxUserNameLength: () => Double,
    getNumericFunctions: () => String,
    getPrimaryKeys: (js.Any, String, String) => XResultSet,
    getProcedureColumns: (js.Any, String, String, String) => XResultSet,
    getProcedureTerm: () => String,
    getProcedures: (js.Any, String, String) => XResultSet,
    getSQLKeywords: () => String,
    getSchemaTerm: () => String,
    getSchemas: () => XResultSet,
    getSearchStringEscape: () => String,
    getStringFunctions: () => String,
    getSystemFunctions: () => String,
    getTablePrivileges: (js.Any, String, String) => XResultSet,
    getTableTypes: () => XResultSet,
    getTables: (js.Any, String, String, SeqEquiv[String]) => XResultSet,
    getTimeDateFunctions: () => String,
    getTypeInfo: () => XResultSet,
    getUDTs: (js.Any, String, String, SeqEquiv[Double]) => XResultSet,
    getURL: () => String,
    getUserName: () => String,
    getVersionColumns: (js.Any, String, String) => XResultSet,
    insertsAreDetected: Double => Boolean,
    isCatalogAtStart: () => Boolean,
    isReadOnly: () => Boolean,
    nullPlusNonNullIsNull: () => Boolean,
    nullsAreSortedAtEnd: () => Boolean,
    nullsAreSortedAtStart: () => Boolean,
    nullsAreSortedHigh: () => Boolean,
    nullsAreSortedLow: () => Boolean,
    othersDeletesAreVisible: Double => Boolean,
    othersInsertsAreVisible: Double => Boolean,
    othersUpdatesAreVisible: Double => Boolean,
    ownDeletesAreVisible: Double => Boolean,
    ownInsertsAreVisible: Double => Boolean,
    ownUpdatesAreVisible: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    storesLowerCaseIdentifiers: () => Boolean,
    storesLowerCaseQuotedIdentifiers: () => Boolean,
    storesMixedCaseIdentifiers: () => Boolean,
    storesMixedCaseQuotedIdentifiers: () => Boolean,
    storesUpperCaseIdentifiers: () => Boolean,
    storesUpperCaseQuotedIdentifiers: () => Boolean,
    supportsANSI92EntryLevelSQL: () => Boolean,
    supportsANSI92FullSQL: () => Boolean,
    supportsANSI92IntermediateSQL: () => Boolean,
    supportsAlterTableWithAddColumn: () => Boolean,
    supportsAlterTableWithDropColumn: () => Boolean,
    supportsBatchUpdates: () => Boolean,
    supportsCatalogsInDataManipulation: () => Boolean,
    supportsCatalogsInIndexDefinitions: () => Boolean,
    supportsCatalogsInPrivilegeDefinitions: () => Boolean,
    supportsCatalogsInProcedureCalls: () => Boolean,
    supportsCatalogsInTableDefinitions: () => Boolean,
    supportsColumnAliasing: () => Boolean,
    supportsConvert: (Double, Double) => Boolean,
    supportsCoreSQLGrammar: () => Boolean,
    supportsCorrelatedSubqueries: () => Boolean,
    supportsDataDefinitionAndDataManipulationTransactions: () => Boolean,
    supportsDataManipulationTransactionsOnly: () => Boolean,
    supportsDifferentTableCorrelationNames: () => Boolean,
    supportsExpressionsInOrderBy: () => Boolean,
    supportsExtendedSQLGrammar: () => Boolean,
    supportsFullOuterJoins: () => Boolean,
    supportsGroupBy: () => Boolean,
    supportsGroupByBeyondSelect: () => Boolean,
    supportsGroupByUnrelated: () => Boolean,
    supportsIntegrityEnhancementFacility: () => Boolean,
    supportsLikeEscapeClause: () => Boolean,
    supportsLimitedOuterJoins: () => Boolean,
    supportsMinimumSQLGrammar: () => Boolean,
    supportsMixedCaseIdentifiers: () => Boolean,
    supportsMixedCaseQuotedIdentifiers: () => Boolean,
    supportsMultipleResultSets: () => Boolean,
    supportsMultipleTransactions: () => Boolean,
    supportsNonNullableColumns: () => Boolean,
    supportsOpenCursorsAcrossCommit: () => Boolean,
    supportsOpenCursorsAcrossRollback: () => Boolean,
    supportsOpenStatementsAcrossCommit: () => Boolean,
    supportsOpenStatementsAcrossRollback: () => Boolean,
    supportsOrderByUnrelated: () => Boolean,
    supportsOuterJoins: () => Boolean,
    supportsPositionedDelete: () => Boolean,
    supportsPositionedUpdate: () => Boolean,
    supportsResultSetConcurrency: (Double, Double) => Boolean,
    supportsResultSetType: Double => Boolean,
    supportsSchemasInDataManipulation: () => Boolean,
    supportsSchemasInIndexDefinitions: () => Boolean,
    supportsSchemasInPrivilegeDefinitions: () => Boolean,
    supportsSchemasInProcedureCalls: () => Boolean,
    supportsSchemasInTableDefinitions: () => Boolean,
    supportsSelectForUpdate: () => Boolean,
    supportsStoredProcedures: () => Boolean,
    supportsSubqueriesInComparisons: () => Boolean,
    supportsSubqueriesInExists: () => Boolean,
    supportsSubqueriesInIns: () => Boolean,
    supportsSubqueriesInQuantifieds: () => Boolean,
    supportsTableCorrelationNames: () => Boolean,
    supportsTransactionIsolationLevel: Double => Boolean,
    supportsTransactions: () => Boolean,
    supportsTypeConversion: () => Boolean,
    supportsUnion: () => Boolean,
    supportsUnionAll: () => Boolean,
    updatesAreDetected: Double => Boolean,
    usesLocalFilePerTable: () => Boolean,
    usesLocalFiles: () => Boolean
  ): XDatabaseMetaData2 = {
    val __obj = js.Dynamic.literal(CatalogSeparator = CatalogSeparator.asInstanceOf[js.Any], CatalogTerm = CatalogTerm.asInstanceOf[js.Any], Catalogs = Catalogs.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], ConnectionInfo = ConnectionInfo.asInstanceOf[js.Any], DatabaseProductName = DatabaseProductName.asInstanceOf[js.Any], DatabaseProductVersion = DatabaseProductVersion.asInstanceOf[js.Any], DefaultTransactionIsolation = DefaultTransactionIsolation.asInstanceOf[js.Any], DriverMajorVersion = DriverMajorVersion.asInstanceOf[js.Any], DriverMinorVersion = DriverMinorVersion.asInstanceOf[js.Any], DriverName = DriverName.asInstanceOf[js.Any], DriverVersion = DriverVersion.asInstanceOf[js.Any], ExtraNameCharacters = ExtraNameCharacters.asInstanceOf[js.Any], IdentifierQuoteString = IdentifierQuoteString.asInstanceOf[js.Any], MaxBinaryLiteralLength = MaxBinaryLiteralLength.asInstanceOf[js.Any], MaxCatalogNameLength = MaxCatalogNameLength.asInstanceOf[js.Any], MaxCharLiteralLength = MaxCharLiteralLength.asInstanceOf[js.Any], MaxColumnNameLength = MaxColumnNameLength.asInstanceOf[js.Any], MaxColumnsInGroupBy = MaxColumnsInGroupBy.asInstanceOf[js.Any], MaxColumnsInIndex = MaxColumnsInIndex.asInstanceOf[js.Any], MaxColumnsInOrderBy = MaxColumnsInOrderBy.asInstanceOf[js.Any], MaxColumnsInSelect = MaxColumnsInSelect.asInstanceOf[js.Any], MaxColumnsInTable = MaxColumnsInTable.asInstanceOf[js.Any], MaxConnections = MaxConnections.asInstanceOf[js.Any], MaxCursorNameLength = MaxCursorNameLength.asInstanceOf[js.Any], MaxIndexLength = MaxIndexLength.asInstanceOf[js.Any], MaxProcedureNameLength = MaxProcedureNameLength.asInstanceOf[js.Any], MaxRowSize = MaxRowSize.asInstanceOf[js.Any], MaxSchemaNameLength = MaxSchemaNameLength.asInstanceOf[js.Any], MaxStatementLength = MaxStatementLength.asInstanceOf[js.Any], MaxStatements = MaxStatements.asInstanceOf[js.Any], MaxTableNameLength = MaxTableNameLength.asInstanceOf[js.Any], MaxTablesInSelect = MaxTablesInSelect.asInstanceOf[js.Any], MaxUserNameLength = MaxUserNameLength.asInstanceOf[js.Any], NumericFunctions = NumericFunctions.asInstanceOf[js.Any], ProcedureTerm = ProcedureTerm.asInstanceOf[js.Any], SQLKeywords = SQLKeywords.asInstanceOf[js.Any], SchemaTerm = SchemaTerm.asInstanceOf[js.Any], Schemas = Schemas.asInstanceOf[js.Any], SearchStringEscape = SearchStringEscape.asInstanceOf[js.Any], StringFunctions = StringFunctions.asInstanceOf[js.Any], SystemFunctions = SystemFunctions.asInstanceOf[js.Any], TableTypes = TableTypes.asInstanceOf[js.Any], TimeDateFunctions = TimeDateFunctions.asInstanceOf[js.Any], TypeInfo = TypeInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), allProceduresAreCallable = js.Any.fromFunction0(allProceduresAreCallable), allTablesAreSelectable = js.Any.fromFunction0(allTablesAreSelectable), dataDefinitionCausesTransactionCommit = js.Any.fromFunction0(dataDefinitionCausesTransactionCommit), dataDefinitionIgnoredInTransactions = js.Any.fromFunction0(dataDefinitionIgnoredInTransactions), deletesAreDetected = js.Any.fromFunction1(deletesAreDetected), doesMaxRowSizeIncludeBlobs = js.Any.fromFunction0(doesMaxRowSizeIncludeBlobs), getBestRowIdentifier = js.Any.fromFunction5(getBestRowIdentifier), getCatalogSeparator = js.Any.fromFunction0(getCatalogSeparator), getCatalogTerm = js.Any.fromFunction0(getCatalogTerm), getCatalogs = js.Any.fromFunction0(getCatalogs), getColumnPrivileges = js.Any.fromFunction4(getColumnPrivileges), getColumns = js.Any.fromFunction4(getColumns), getConnection = js.Any.fromFunction0(getConnection), getConnectionInfo = js.Any.fromFunction0(getConnectionInfo), getCrossReference = js.Any.fromFunction6(getCrossReference), getDatabaseProductName = js.Any.fromFunction0(getDatabaseProductName), getDatabaseProductVersion = js.Any.fromFunction0(getDatabaseProductVersion), getDefaultTransactionIsolation = js.Any.fromFunction0(getDefaultTransactionIsolation), getDriverMajorVersion = js.Any.fromFunction0(getDriverMajorVersion), getDriverMinorVersion = js.Any.fromFunction0(getDriverMinorVersion), getDriverName = js.Any.fromFunction0(getDriverName), getDriverVersion = js.Any.fromFunction0(getDriverVersion), getExportedKeys = js.Any.fromFunction3(getExportedKeys), getExtraNameCharacters = js.Any.fromFunction0(getExtraNameCharacters), getIdentifierQuoteString = js.Any.fromFunction0(getIdentifierQuoteString), getImportedKeys = js.Any.fromFunction3(getImportedKeys), getIndexInfo = js.Any.fromFunction5(getIndexInfo), getMaxBinaryLiteralLength = js.Any.fromFunction0(getMaxBinaryLiteralLength), getMaxCatalogNameLength = js.Any.fromFunction0(getMaxCatalogNameLength), getMaxCharLiteralLength = js.Any.fromFunction0(getMaxCharLiteralLength), getMaxColumnNameLength = js.Any.fromFunction0(getMaxColumnNameLength), getMaxColumnsInGroupBy = js.Any.fromFunction0(getMaxColumnsInGroupBy), getMaxColumnsInIndex = js.Any.fromFunction0(getMaxColumnsInIndex), getMaxColumnsInOrderBy = js.Any.fromFunction0(getMaxColumnsInOrderBy), getMaxColumnsInSelect = js.Any.fromFunction0(getMaxColumnsInSelect), getMaxColumnsInTable = js.Any.fromFunction0(getMaxColumnsInTable), getMaxConnections = js.Any.fromFunction0(getMaxConnections), getMaxCursorNameLength = js.Any.fromFunction0(getMaxCursorNameLength), getMaxIndexLength = js.Any.fromFunction0(getMaxIndexLength), getMaxProcedureNameLength = js.Any.fromFunction0(getMaxProcedureNameLength), getMaxRowSize = js.Any.fromFunction0(getMaxRowSize), getMaxSchemaNameLength = js.Any.fromFunction0(getMaxSchemaNameLength), getMaxStatementLength = js.Any.fromFunction0(getMaxStatementLength), getMaxStatements = js.Any.fromFunction0(getMaxStatements), getMaxTableNameLength = js.Any.fromFunction0(getMaxTableNameLength), getMaxTablesInSelect = js.Any.fromFunction0(getMaxTablesInSelect), getMaxUserNameLength = js.Any.fromFunction0(getMaxUserNameLength), getNumericFunctions = js.Any.fromFunction0(getNumericFunctions), getPrimaryKeys = js.Any.fromFunction3(getPrimaryKeys), getProcedureColumns = js.Any.fromFunction4(getProcedureColumns), getProcedureTerm = js.Any.fromFunction0(getProcedureTerm), getProcedures = js.Any.fromFunction3(getProcedures), getSQLKeywords = js.Any.fromFunction0(getSQLKeywords), getSchemaTerm = js.Any.fromFunction0(getSchemaTerm), getSchemas = js.Any.fromFunction0(getSchemas), getSearchStringEscape = js.Any.fromFunction0(getSearchStringEscape), getStringFunctions = js.Any.fromFunction0(getStringFunctions), getSystemFunctions = js.Any.fromFunction0(getSystemFunctions), getTablePrivileges = js.Any.fromFunction3(getTablePrivileges), getTableTypes = js.Any.fromFunction0(getTableTypes), getTables = js.Any.fromFunction4(getTables), getTimeDateFunctions = js.Any.fromFunction0(getTimeDateFunctions), getTypeInfo = js.Any.fromFunction0(getTypeInfo), getUDTs = js.Any.fromFunction4(getUDTs), getURL = js.Any.fromFunction0(getURL), getUserName = js.Any.fromFunction0(getUserName), getVersionColumns = js.Any.fromFunction3(getVersionColumns), insertsAreDetected = js.Any.fromFunction1(insertsAreDetected), isCatalogAtStart = js.Any.fromFunction0(isCatalogAtStart), isReadOnly = js.Any.fromFunction0(isReadOnly), nullPlusNonNullIsNull = js.Any.fromFunction0(nullPlusNonNullIsNull), nullsAreSortedAtEnd = js.Any.fromFunction0(nullsAreSortedAtEnd), nullsAreSortedAtStart = js.Any.fromFunction0(nullsAreSortedAtStart), nullsAreSortedHigh = js.Any.fromFunction0(nullsAreSortedHigh), nullsAreSortedLow = js.Any.fromFunction0(nullsAreSortedLow), othersDeletesAreVisible = js.Any.fromFunction1(othersDeletesAreVisible), othersInsertsAreVisible = js.Any.fromFunction1(othersInsertsAreVisible), othersUpdatesAreVisible = js.Any.fromFunction1(othersUpdatesAreVisible), ownDeletesAreVisible = js.Any.fromFunction1(ownDeletesAreVisible), ownInsertsAreVisible = js.Any.fromFunction1(ownInsertsAreVisible), ownUpdatesAreVisible = js.Any.fromFunction1(ownUpdatesAreVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), storesLowerCaseIdentifiers = js.Any.fromFunction0(storesLowerCaseIdentifiers), storesLowerCaseQuotedIdentifiers = js.Any.fromFunction0(storesLowerCaseQuotedIdentifiers), storesMixedCaseIdentifiers = js.Any.fromFunction0(storesMixedCaseIdentifiers), storesMixedCaseQuotedIdentifiers = js.Any.fromFunction0(storesMixedCaseQuotedIdentifiers), storesUpperCaseIdentifiers = js.Any.fromFunction0(storesUpperCaseIdentifiers), storesUpperCaseQuotedIdentifiers = js.Any.fromFunction0(storesUpperCaseQuotedIdentifiers), supportsANSI92EntryLevelSQL = js.Any.fromFunction0(supportsANSI92EntryLevelSQL), supportsANSI92FullSQL = js.Any.fromFunction0(supportsANSI92FullSQL), supportsANSI92IntermediateSQL = js.Any.fromFunction0(supportsANSI92IntermediateSQL), supportsAlterTableWithAddColumn = js.Any.fromFunction0(supportsAlterTableWithAddColumn), supportsAlterTableWithDropColumn = js.Any.fromFunction0(supportsAlterTableWithDropColumn), supportsBatchUpdates = js.Any.fromFunction0(supportsBatchUpdates), supportsCatalogsInDataManipulation = js.Any.fromFunction0(supportsCatalogsInDataManipulation), supportsCatalogsInIndexDefinitions = js.Any.fromFunction0(supportsCatalogsInIndexDefinitions), supportsCatalogsInPrivilegeDefinitions = js.Any.fromFunction0(supportsCatalogsInPrivilegeDefinitions), supportsCatalogsInProcedureCalls = js.Any.fromFunction0(supportsCatalogsInProcedureCalls), supportsCatalogsInTableDefinitions = js.Any.fromFunction0(supportsCatalogsInTableDefinitions), supportsColumnAliasing = js.Any.fromFunction0(supportsColumnAliasing), supportsConvert = js.Any.fromFunction2(supportsConvert), supportsCoreSQLGrammar = js.Any.fromFunction0(supportsCoreSQLGrammar), supportsCorrelatedSubqueries = js.Any.fromFunction0(supportsCorrelatedSubqueries), supportsDataDefinitionAndDataManipulationTransactions = js.Any.fromFunction0(supportsDataDefinitionAndDataManipulationTransactions), supportsDataManipulationTransactionsOnly = js.Any.fromFunction0(supportsDataManipulationTransactionsOnly), supportsDifferentTableCorrelationNames = js.Any.fromFunction0(supportsDifferentTableCorrelationNames), supportsExpressionsInOrderBy = js.Any.fromFunction0(supportsExpressionsInOrderBy), supportsExtendedSQLGrammar = js.Any.fromFunction0(supportsExtendedSQLGrammar), supportsFullOuterJoins = js.Any.fromFunction0(supportsFullOuterJoins), supportsGroupBy = js.Any.fromFunction0(supportsGroupBy), supportsGroupByBeyondSelect = js.Any.fromFunction0(supportsGroupByBeyondSelect), supportsGroupByUnrelated = js.Any.fromFunction0(supportsGroupByUnrelated), supportsIntegrityEnhancementFacility = js.Any.fromFunction0(supportsIntegrityEnhancementFacility), supportsLikeEscapeClause = js.Any.fromFunction0(supportsLikeEscapeClause), supportsLimitedOuterJoins = js.Any.fromFunction0(supportsLimitedOuterJoins), supportsMinimumSQLGrammar = js.Any.fromFunction0(supportsMinimumSQLGrammar), supportsMixedCaseIdentifiers = js.Any.fromFunction0(supportsMixedCaseIdentifiers), supportsMixedCaseQuotedIdentifiers = js.Any.fromFunction0(supportsMixedCaseQuotedIdentifiers), supportsMultipleResultSets = js.Any.fromFunction0(supportsMultipleResultSets), supportsMultipleTransactions = js.Any.fromFunction0(supportsMultipleTransactions), supportsNonNullableColumns = js.Any.fromFunction0(supportsNonNullableColumns), supportsOpenCursorsAcrossCommit = js.Any.fromFunction0(supportsOpenCursorsAcrossCommit), supportsOpenCursorsAcrossRollback = js.Any.fromFunction0(supportsOpenCursorsAcrossRollback), supportsOpenStatementsAcrossCommit = js.Any.fromFunction0(supportsOpenStatementsAcrossCommit), supportsOpenStatementsAcrossRollback = js.Any.fromFunction0(supportsOpenStatementsAcrossRollback), supportsOrderByUnrelated = js.Any.fromFunction0(supportsOrderByUnrelated), supportsOuterJoins = js.Any.fromFunction0(supportsOuterJoins), supportsPositionedDelete = js.Any.fromFunction0(supportsPositionedDelete), supportsPositionedUpdate = js.Any.fromFunction0(supportsPositionedUpdate), supportsResultSetConcurrency = js.Any.fromFunction2(supportsResultSetConcurrency), supportsResultSetType = js.Any.fromFunction1(supportsResultSetType), supportsSchemasInDataManipulation = js.Any.fromFunction0(supportsSchemasInDataManipulation), supportsSchemasInIndexDefinitions = js.Any.fromFunction0(supportsSchemasInIndexDefinitions), supportsSchemasInPrivilegeDefinitions = js.Any.fromFunction0(supportsSchemasInPrivilegeDefinitions), supportsSchemasInProcedureCalls = js.Any.fromFunction0(supportsSchemasInProcedureCalls), supportsSchemasInTableDefinitions = js.Any.fromFunction0(supportsSchemasInTableDefinitions), supportsSelectForUpdate = js.Any.fromFunction0(supportsSelectForUpdate), supportsStoredProcedures = js.Any.fromFunction0(supportsStoredProcedures), supportsSubqueriesInComparisons = js.Any.fromFunction0(supportsSubqueriesInComparisons), supportsSubqueriesInExists = js.Any.fromFunction0(supportsSubqueriesInExists), supportsSubqueriesInIns = js.Any.fromFunction0(supportsSubqueriesInIns), supportsSubqueriesInQuantifieds = js.Any.fromFunction0(supportsSubqueriesInQuantifieds), supportsTableCorrelationNames = js.Any.fromFunction0(supportsTableCorrelationNames), supportsTransactionIsolationLevel = js.Any.fromFunction1(supportsTransactionIsolationLevel), supportsTransactions = js.Any.fromFunction0(supportsTransactions), supportsTypeConversion = js.Any.fromFunction0(supportsTypeConversion), supportsUnion = js.Any.fromFunction0(supportsUnion), supportsUnionAll = js.Any.fromFunction0(supportsUnionAll), updatesAreDetected = js.Any.fromFunction1(updatesAreDetected), usesLocalFilePerTable = js.Any.fromFunction0(usesLocalFilePerTable), usesLocalFiles = js.Any.fromFunction0(usesLocalFiles))
    __obj.asInstanceOf[XDatabaseMetaData2]
  }
  
  @scala.inline
  implicit class XDatabaseMetaData2MutableBuilder[Self <: XDatabaseMetaData2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionInfo(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ConnectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConnectionInfo(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getConnectionInfo", js.Any.fromFunction0(value))
  }
}
