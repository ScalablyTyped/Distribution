package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides comprehensive information about the database as a whole.
  *
  * Many of the methods here return lists of information in the form of {@link com.sun.star.sdbc.XResultSet} objects. You can use the normal {@link
  * com.sun.star.sdbc.XRow} (or {@link com.sun.star.sdb.XColumn} ) methods such as {@link com.sun.star.sdbc.XRow.getString()} and {@link
  * com.sun.star.sdbc.XRow.getInt()} to retrieve the data from these XResultSets. If a given form of metadata is not available, these methods should throw
  * a {@link com.sun.star.sdbc.SQLException} . After calling one of the getXXX() methods, one can check whether that value is `NULL` with the method
  * {@link com.sun.star.sdbc.XRow.wasNull()} . In the text only "(may be `NULL`)" is mentioned for this case.
  *
  * Some of these methods take arguments that are String patterns. These arguments all have names such as fooPattern. Within a pattern String, "%" means
  * match any substring of 0 or more characters, and "_" means match any one character. Only metadata entries matching the search pattern are returned. If
  * a search pattern argument is set to `VOID` , that argument's criteria will be dropped from the search.
  *
  * A {@link com.sun.star.sdbc.SQLException} will be thrown if a driver does not support a metadata method. In the case of methods that return an {@link
  * XResultSet} , either an {@link XResultSet} (which may be empty) is returned or a {@link SQLException} is thrown.
  */
@js.native
trait XDatabaseMetaData extends XInterface {
  
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogSeparator: String = js.native
  
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogTerm: String = js.native
  
  /**
    * gets the catalog names available in this database. The results are ordered by catalog name.
    *
    * The catalog column is:
    *
    *  1. **TABLE_CAT** string => catalog name
    * @returns each row has a single String column that is a catalog name
    * @throws SQLException if a database access error occurs.
    */
  val Catalogs: XResultSet = js.native
  
  /**
    * retrieves the connection that produced this metadata object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  val Connection: XConnection = js.native
  
  /** returns the name of the database product. */
  val DatabaseProductName: String = js.native
  
  /** returns the version of the database product. */
  val DatabaseProductVersion: String = js.native
  
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  val DefaultTransactionIsolation: Double = js.native
  
  /** returns the SDBC driver major version number. */
  val DriverMajorVersion: Double = js.native
  
  /** returns the SDBC driver minor version number. */
  val DriverMinorVersion: Double = js.native
  
  /** returns the name of the SDBC driver. */
  val DriverName: String = js.native
  
  /** returns the version number of the SDBC driver. */
  val DriverVersion: String = js.native
  
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ExtraNameCharacters: String = js.native
  
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val IdentifierQuoteString: String = js.native
  
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxBinaryLiteralLength: Double = js.native
  
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCatalogNameLength: Double = js.native
  
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCharLiteralLength: Double = js.native
  
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnNameLength: Double = js.native
  
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInGroupBy: Double = js.native
  
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInIndex: Double = js.native
  
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInOrderBy: Double = js.native
  
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInSelect: Double = js.native
  
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInTable: Double = js.native
  
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxConnections: Double = js.native
  
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCursorNameLength: Double = js.native
  
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxIndexLength: Double = js.native
  
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxProcedureNameLength: Double = js.native
  
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxRowSize: Double = js.native
  
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxSchemaNameLength: Double = js.native
  
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatementLength: Double = js.native
  
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatements: Double = js.native
  
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTableNameLength: Double = js.native
  
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTablesInSelect: Double = js.native
  
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxUserNameLength: Double = js.native
  
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val NumericFunctions: String = js.native
  
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ProcedureTerm: String = js.native
  
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SQLKeywords: String = js.native
  
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SchemaTerm: String = js.native
  
  /**
    * Gets the schema names available in this database. The results are ordered by schema name.
    *
    * The schema column is:
    *
    *  1. **TABLE_SCHEM** string => schema name
    * @returns each row has a single String column that is a schema name
    * @throws SQLException if a database access error occurs.
    */
  val Schemas: XResultSet = js.native
  
  /**
    * gets the string that can be used to escape wildcard characters. This is the string that can be used to escape "_" or "%" in the string pattern style
    * catalog search parameters.
    *
    * The "_" character represents any single character.
    *
    * The "%" character represents any sequence of zero or more characters.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SearchStringEscape: String = js.native
  
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val StringFunctions: String = js.native
  
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SystemFunctions: String = js.native
  
  /**
    * gets the table types available in this database. The results are ordered by table type.
    *
    * The table type is:
    *
    *  1. **TABLE_TYPE** string => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
    * @returns each row has a single String column that is a table type
    * @throws SQLException if a database access error occurs.
    */
  val TableTypes: XResultSet = js.native
  
  /**
    * gets a comma-separated list of time and date functions.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val TimeDateFunctions: String = js.native
  
  /**
    * gets a description of all the standard SQL types supported by this database. They are ordered by DATA_TYPE and then by how closely the data type maps
    * to the corresponding SDBC SQL type.
    *
    * Each type description has the following columns:
    *
    *  1. **TYPE_NAME** string => Type name 2. **DATA_TYPE** short => SQL data type from java.sql.Types 3. **PRECISION** long => maximum precision 4.
    * **LITERAL_PREFIX** string => prefix used to quote a literal (may be `NULL` ) 5. **LITERAL_SUFFIX** string => suffix used to quote a literal (may be
    * `NULL` ) 6. **CREATE_PARAMS** string => parameters used in creating the type (may be `NULL` ) 7. **NULLABLE** short => can you use NULL for this type?
    * NO_NULLS - does not allow NULL valuesNULLABLE - allows NULL valuesNULLABLE_UNKNOWN - nullability unknown 8. **CASE_SENSITIVE** boolean=> is it case
    * sensitive? 9. **SEARCHABLE** short => can you use "WHERE" based on this type: NONE - No supportCHAR - Only supported with WHERE .. LIKEBASIC -
    * Supported except for WHERE .. LIKEFULL - Supported for all WHERE .. 10. **UNSIGNED_ATTRIBUTE** boolean => is it unsigned? 11. **FIXED_PREC_SCALE**
    * boolean => can it be a money value? 12. **AUTO_INCREMENT** boolean => can it be used for an auto-increment value? 13. **LOCAL_TYPE_NAME** string =>
    * localized version of type name (may be `NULL` ) 14. **MINIMUM_SCALE** short => minimum scale supported 15. **MAXIMUM_SCALE** short => maximum scale
    * supported 16. **SQL_DATA_TYPE** long => unused 17. **SQL_DATETIME_SUB** long => unused 18. **NUM_PREC_RADIX** long => usually 2 or 10
    * @returns each row is a SQL type description
    * @throws SQLException if a database access error occurs.
    */
  val TypeInfo: XResultSet = js.native
  
  /** returns the URL for the database connection */
  val URL: String = js.native
  
  /** returns the user name from this database connection. */
  val UserName: String = js.native
  
  /**
    * Can all the procedures returned by getProcedures be called by the current user?
    * @returns `TRUE` if the user is allowed to call all procedures returned by getProcedures otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def allProceduresAreCallable(): Boolean = js.native
  
  /**
    * Can all the tables returned by getTable be SELECTed by the current user?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def allTablesAreSelectable(): Boolean = js.native
  
  /**
    * does a data definition statement within a transaction force the transaction to commit?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionCausesTransactionCommit(): Boolean = js.native
  
  /**
    * is a data definition statement within a transaction ignored?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionIgnoredInTransactions(): Boolean = js.native
  
  /**
    * indicates whether or not a visible row delete can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowDeleted()} . If {@link
    * deletesAreDetected()} returns `FALSE` , then deleted rows are removed from the result set.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def deletesAreDetected(setType: Double): Boolean = js.native
  
  /**
    * Did {@link getMaxRowSize()} include LONGVARCHAR and LONGVARBINARY blobs?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def doesMaxRowSizeIncludeBlobs(): Boolean = js.native
  
  /**
    * gets a description of a table's optimal set of columns that uniquely identifies a row. They are ordered by SCOPE.
    *
    * Each column description has the following columns:
    *
    *  1. **SCOPE** short => actual scope of result TEMPORARY - very temporary, while using rowTRANSACTION - valid for remainder of current
    * transactionSESSION - valid for remainder of current session 2. **COLUMN_NAME** string => column name 3. **DATA_TYPE** short => SQL data type from
    * java.sql.Types 4. **TYPE_NAME** string => Data source dependent type name, for a UDT the type name is fully qualified 5. **COLUMN_SIZE** long =>
    * precision 6. **BUFFER_LENGTH** long => not used 7. **DECIMAL_DIGITS** short => scale 8. **PSEUDO_COLUMN** short => is this a pseudo column like an
    * Oracle ROWID UNKNOWN - may or may not be pseudo columnNOT_PSEUDO - is NOT a pseudo columnPSEUDO - is a pseudo column
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table a table name
    * @param scope the scope of interest; use same values as SCOPE
    * @param nullable include columns that are nullable?
    * @returns each row is a column description
    * @throws SQLException if a database access error occurs.
    */
  def getBestRowIdentifier(catalog: js.Any, schema: String, table: String, scope: Double, nullable: Boolean): XResultSet = js.native
  
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogSeparator(): String = js.native
  
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogTerm(): String = js.native
  
  /**
    * gets the catalog names available in this database. The results are ordered by catalog name.
    *
    * The catalog column is:
    *
    *  1. **TABLE_CAT** string => catalog name
    * @returns each row has a single String column that is a catalog name
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogs(): XResultSet = js.native
  
  /**
    * gets a description of the access rights for a table's columns.
    *
    * Only privileges matching the column name criteria are returned. They are ordered by COLUMN_NAME and PRIVILEGE.
    *
    * Each privilege description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **COLUMN_NAME** string => column name 5. **GRANTOR** => granter of access (may be `NULL` ) 6. **GRANTEE** string => grantee of access 7.
    * **PRIVILEGE** string => name of access (SELECT, INSERT, UPDATE, REFERENCES, ...) 8. **IS_GRANTABLE** string => "YES" if grantee is permitted to grant
    * to others; "NO" if not; `NULL` if unknown
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name ; "" retrieves those without a schema
    * @param table a table name
    * @param columnNamePattern a column name pattern
    * @returns each row is a column privilege description
    * @throws SQLException if a database access error occurs.
    */
  def getColumnPrivileges(catalog: js.Any, schema: String, table: String, columnNamePattern: String): XResultSet = js.native
  
  /**
    * gets a description of table columns available in the specified catalog.
    *
    * Only column descriptions matching the catalog, schema, table and column name criteria are returned. They are ordered by TABLE_SCHEM, TABLE_NAME, and
    * ORDINAL_POSITION.
    *
    * Each column description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **COLUMN_NAME** string => column name 5. **DATA_TYPE** short => SQL type from java.sql.Types 6. **TYPE_NAME** string => Data source
    * dependent type name, for a UDT the type name is fully qualified 7. **COLUMN_SIZE** long => column size. For char or date types this is the maximum
    * number of characters, for numeric or decimal types this is precision. 8. **BUFFER_LENGTH** is not used. 9. **DECIMAL_DIGITS** long => the number of
    * fractional digits 10. **NUM_PREC_RADIX** long => Radix (typically either 10 or 2) 11. **NULLABLE** long => is NULL allowed? NO_NULLS - might not allow
    * NULL valuesNULLABLE - definitely allows NULL valuesNULLABLE_UNKNOWN - nullability unknown 12. **REMARKS** string => comment describing column (may be
    * `NULL` ) 13. **COLUMN_DEF** string => default value (may be `NULL` ) 14. **SQL_DATA_TYPE** long => unused 15. **SQL_DATETIME_SUB** long => unused 16.
    * **CHAR_OCTET_LENGTH** long => for char types the maximum number of bytes in the column 17. **ORDINAL_POSITION** int => index of column in table
    * (starting at 1) 18. **IS_NULLABLE** string => "NO" means column definitely does not allow NULL values; "YES" means the column might allow NULL values.
    * An empty string means nobody knows.
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param tableNamePattern a table name pattern
    * @param columnNamePattern a column name pattern
    * @returns each row is a column description
    * @throws SQLException if a database access error occurs.
    */
  def getColumns(catalog: js.Any, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): XResultSet = js.native
  
  /**
    * retrieves the connection that produced this metadata object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(): XConnection = js.native
  
  /**
    * gets a description of the foreign key columns in the foreign key table that reference the primary key columns of the primary key table (describe how
    * one table imports another's key.) This should normally return a single foreign key/primary key pair (most tables only import a foreign key from a
    * table once.). They are ordered by FKTABLE_CAT, FKTABLE_SCHEM, FKTABLE_NAME, and KEY_SEQ.
    *
    * Each foreign key column description has the following columns:
    *
    *  1. **PKTABLE_CAT** string => primary key table catalog (may be `NULL` ) 2. **PKTABLE_SCHEM** string => primary key table schema (may be `NULL` ) 3.
    * **PKTABLE_NAME** string => primary key table name 4. **PKCOLUMN_NAME** string => primary key column name 5. **FKTABLE_CAT** string => foreign key
    * table catalog (may be `NULL` ) being exported (may be `NULL` ) 6. **FKTABLE_SCHEM** string => foreign key table schema (may be `NULL` ) being exported
    * (may be `NULL` ) 7. **FKTABLE_NAME** string => foreign key table name being exported 8. **FKCOLUMN_NAME** string => foreign key column name being
    * exported 9. **KEY_SEQ** short => sequence number within foreign key 10. **UPDATE_RULE** short => What happens to foreign key when primary is updated:
    * NO_ACTION - do not allow update of primary key if it has been importedCASCADE - change imported key to agree with primary key updateSET_NULL - change
    * imported key to NULL if its primary key has been updatedSET_DEFAULT - change imported key to default values if its primary key has been
    * updatedRESTRICT - same as importedKeyNoAction (for ODBC 2.x compatibility) 11. **DELETE_RULE** short => What happens to the foreign key when primary
    * is deleted. NO_ACTION - do not allow delete of primary key if it has been importedCASCADE - delete rows that import a deleted keySET_NULL - change
    * imported key to NULL if its primary key has been deletedRESTRICT - same as importedKeyNoAction (for ODBC 2.x compatibility)SET_DEFAULT - change
    * imported key to default if its primary key has been deleted 12. **FK_NAME** string => foreign key name (may be `NULL` ) 13. **PK_NAME** string =>
    * primary key name (may be `NULL` ) 14. **DEFERRABILITY** short => can the evaluation of foreign key constraints be deferred until commit
    * INITIALLY_DEFERRED - see SQL92 for definitionINITIALLY_IMMEDIATE - see SQL92 for definitionNONE - see SQL92 for definition
    * @param primaryCatalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param primarySchema a schema name; "" retrieves those without a schema
    * @param primaryTable the table name that exports the key
    * @param foreignCatalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param foreignSchema a schema name; "" retrieves those without a schema
    * @param foreignTable the table name that imports the key
    * @returns each row is a foreign key column description
    * @throws SQLException if a database access error occurs.
    */
  def getCrossReference(
    primaryCatalog: js.Any,
    primarySchema: String,
    primaryTable: String,
    foreignCatalog: js.Any,
    foreignSchema: String,
    foreignTable: String
  ): XResultSet = js.native
  
  /** returns the name of the database product. */
  def getDatabaseProductName(): String = js.native
  
  /** returns the version of the database product. */
  def getDatabaseProductVersion(): String = js.native
  
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  def getDefaultTransactionIsolation(): Double = js.native
  
  /** returns the SDBC driver major version number. */
  def getDriverMajorVersion(): Double = js.native
  
  /** returns the SDBC driver minor version number. */
  def getDriverMinorVersion(): Double = js.native
  
  /** returns the name of the SDBC driver. */
  def getDriverName(): String = js.native
  
  /** returns the version number of the SDBC driver. */
  def getDriverVersion(): String = js.native
  
  /**
    * gets a description of the foreign key columns that reference a table's primary key columns (the foreign keys exported by a table). They are ordered by
    * FKTABLE_CAT, FKTABLE_SCHEM, FKTABLE_NAME, and KEY_SEQ.
    *
    * Each foreign key column description has the following columns:
    *
    *  1. **PKTABLE_CAT** string => primary key table catalog (may be `NULL` ) 2. **PKTABLE_SCHEM** string => primary key table schema (may be `NULL` ) 3.
    * **PKTABLE_NAME** string => primary key table name 4. **PKCOLUMN_NAME** string => primary key column name 5. **FKTABLE_CAT** string => foreign key
    * table catalog (may be `NULL` ) being exported (may be `NULL` ) 6. **FKTABLE_SCHEM** string => foreign key table schema (may be `NULL` ) being exported
    * (may be `NULL` ) 7. **FKTABLE_NAME** string => foreign key table name being exported 8. **FKCOLUMN_NAME** string => foreign key column name being
    * exported 9. **KEY_SEQ** short => sequence number within foreign key 10. **UPDATE_RULE** short => What happens to foreign key when primary is updated:
    * NO_ACTION - do not allow update of primary key if it has been importedCASCADE - change imported key to agree with primary key updateSET_NULL - change
    * imported key to NULL if its primary key has been updatedSET_DEFAULT - change imported key to default values if its primary key has been
    * updatedRESTRICT - same as importedKeyNoAction (for ODBC 2.x compatibility) 11. **DELETE_RULE** short => What happens to the foreign key when primary
    * is deleted. NO_ACTION - do not allow delete of primary key if it has been importedCASCADE - delete rows that import a deleted keySET_NULL - change
    * imported key to NULL if its primary key has been deletedRESTRICT - same as importedKeyNoAction (for ODBC 2.x compatibility)SET_DEFAULT - change
    * imported key to default if its primary key has been deleted 12. **FK_NAME** string => foreign key name (may be `NULL` ) 13. **PK_NAME** string =>
    * primary key name (may be `NULL` ) 14. **DEFERRABILITY** short => can the evaluation of foreign key constraints be deferred until commit
    * INITIALLY_DEFERRED - see SQL92 for definitionINITIALLY_IMMEDIATE - see SQL92 for definitionNONE - see SQL92 for definition
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table a table name
    * @returns each row is a foreign key column description
    * @throws SQLException if a database access error occurs.
    */
  def getExportedKeys(catalog: js.Any, schema: String, table: String): XResultSet = js.native
  
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getExtraNameCharacters(): String = js.native
  
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getIdentifierQuoteString(): String = js.native
  
  /**
    * gets a description of the primary key columns that are referenced by a table's foreign key columns (the primary keys imported by a table). They are
    * ordered by PKTABLE_CAT, PKTABLE_SCHEM, PKTABLE_NAME, and KEY_SEQ.
    *
    * Each primary key column description has the following columns:
    *
    *  1. **PKTABLE_CAT** string => primary key table catalog being imported (may be `NULL` ) 2. **PKTABLE_SCHEM** string => primary key table schema being
    * imported (may be `NULL` ) 3. **PKTABLE_NAME** string => primary key table name being imported 4. **PKCOLUMN_NAME** string => primary key column name
    * being imported 5. **FKTABLE_CAT** string => foreign key table catalog (may be `NULL` ) 6. **FKTABLE_SCHEM** string => foreign key table schema (may be
    * `NULL` ) 7. **FKTABLE_NAME** string => foreign key table name 8. **FKCOLUMN_NAME** string => foreign key column name 9. **KEY_SEQ** short => sequence
    * number within foreign key 10. **UPDATE_RULE** short => What happens to foreign key when primary is updated: importedNoAction - do not allow update of
    * primary key if it has been importedimportedKeyCascade - change imported key to agree with primary key updateimportedKeySetNull - change imported key
    * to NULL if its primary key has been updatedimportedKeySetDefault - change imported key to default values if its primary key has been
    * updatedimportedKeyRestrict - same as importedKeyNoAction (for ODBC 2.x compatibility) 11. **DELETE_RULE** short => What happens to the foreign key
    * when primary is deleted. importedKeyNoAction - do not allow delete of primary key if it has been importedimportedKeyCascade - delete rows that import
    * a deleted keyimportedKeySetNull - change imported key to NULL if its primary key has been deletedimportedKeyRestrict - same as importedKeyNoAction
    * (for ODBC 2.x compatibility)importedKeySetDefault - change imported key to default if its primary key has been deleted 12. **FK_NAME** string =>
    * foreign key name (may be `NULL` ) 13. **PK_NAME** string => primary key name (may be `NULL` ) 14. **DEFERRABILITY** short => can the evaluation of
    * foreign key constraints be deferred until commit importedKeyInitiallyDeferred - see SQL92 for definitionimportedKeyInitiallyImmediate - see SQL92 for
    * definitionimportedKeyNotDeferrable - see SQL92 for definition
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table a table name
    * @returns each row is a primary key column description
    * @throws SQLException if a database access error occurs.
    */
  def getImportedKeys(catalog: js.Any, schema: String, table: String): XResultSet = js.native
  
  /**
    * gets a description of a table's indices and statistics. They are ordered by NON_UNIQUE, TYPE, INDEX_NAME, and ORDINAL_POSITION.
    *
    * Each index column description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **NON_UNIQUE** boolean => Can index values be non-unique? `FALSE` when TYPE is tableIndexStatistic 5. **INDEX_QUALIFIER** string =>
    * index catalog (may be `NULL` ); `NULL` when TYPE is tableIndexStatistic 6. **INDEX_NAME** string => index name; `NULL` when TYPE is
    * tableIndexStatistic 7. **TYPE** short => index type: 0 - this identifies table statistics that are returned in conjunction with a table's index
    * descriptionsCLUSTERED - this is a clustered indexHASHED - this is a hashed indexOTHER - this is some other style of index 8. **ORDINAL_POSITION**
    * short => column sequence number within index; zero when TYPE is tableIndexStatistic 9. **COLUMN_NAME** string => column name; `NULL` when TYPE is
    * tableIndexStatistic 10. **ASC_OR_DESC** string => column sort sequence, "A" => ascending, "D" => descending, may be `NULL` if sort sequence is not
    * supported; `NULL` when TYPE is tableIndexStatistic 11. **CARDINALITY** long => When TYPE is tableIndexStatistic, then this is the number of rows in
    * the table; otherwise, it is the number of unique values in the index. 12. **PAGES** long => When TYPE is tableIndexStatisic then this is the number of
    * pages used for the table, otherwise it is the number of pages used for the current index. 13. **FILTER_CONDITION** string => Filter condition, if any.
    * (may be `NULL` )
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table the table name that exports the key
    * @param unique when `TRUE` , return only indices for unique values; when `FALSE` , return indices regardless of whether unique or not
    * @param approximate when `TRUE` , result is allowed to reflect approximate or out of data values; when `FALSE` , results are requested to be accurate
    * @returns each row is an index column description
    * @throws SQLException if a database access error occurs.
    */
  def getIndexInfo(catalog: js.Any, schema: String, table: String, unique: Boolean, approximate: Boolean): XResultSet = js.native
  
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxBinaryLiteralLength(): Double = js.native
  
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCatalogNameLength(): Double = js.native
  
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCharLiteralLength(): Double = js.native
  
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnNameLength(): Double = js.native
  
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInGroupBy(): Double = js.native
  
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInIndex(): Double = js.native
  
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInOrderBy(): Double = js.native
  
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInSelect(): Double = js.native
  
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInTable(): Double = js.native
  
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxConnections(): Double = js.native
  
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCursorNameLength(): Double = js.native
  
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxIndexLength(): Double = js.native
  
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxProcedureNameLength(): Double = js.native
  
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxRowSize(): Double = js.native
  
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxSchemaNameLength(): Double = js.native
  
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatementLength(): Double = js.native
  
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatements(): Double = js.native
  
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTableNameLength(): Double = js.native
  
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTablesInSelect(): Double = js.native
  
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxUserNameLength(): Double = js.native
  
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getNumericFunctions(): String = js.native
  
  /**
    * gets a description of a table's primary key columns. They are ordered by COLUMN_NAME.
    *
    * Each primary key column description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **COLUMN_NAME** string => column name 5. **KEY_SEQ** short => sequence number within primary key 6. **PK_NAME** string => primary key
    * name (may be `NULL` )
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table a table name
    * @returns each row is a primary key column description
    * @throws SQLException if a database access error occurs.
    */
  def getPrimaryKeys(catalog: js.Any, schema: String, table: String): XResultSet = js.native
  
  /**
    * gets a description of a catalog's stored procedure parameters and result columns.
    *
    * Only descriptions matching the schema, procedure and parameter name criteria are returned. They are ordered by PROCEDURE_SCHEM and PROCEDURE_NAME.
    * Within this, the return value, if any, is first. Next are the parameter descriptions in call order. The column descriptions follow in column number
    * order.
    *
    * Each row in the {@link XResultSet} is a parameter description or column description with the following fields:
    *
    *  1. **PROCEDURE_CAT** string => procedure catalog (may be `NULL` ) 2. **PROCEDURE_SCHEM** string => procedure schema (may be `NULL` ) 3.
    * **PROCEDURE_NAME** string => procedure name 4. **COLUMN_NAME** string => column/parameter name 5. **COLUMN_TYPE** Short => kind of column/parameter:
    * UNKNOWN - nobody knowsIN - IN parameterINOUT - INOUT parameterOUT - OUT parameterRETURN - procedure return valueRESULT - result column in {@link
    * XResultSet} 6. **DATA_TYPE** short => SQL type from java.sql.Types 7. **TYPE_NAME** string => SQL type name, for a UDT type the type name is fully
    * qualified 8. **PRECISION** long => precision 9. **LENGTH** long => length in bytes of data 10. **SCALE** short => scale 11. **RADIX** short => radix
    * 12. **NULLABLE** short => can it contain NULL? NO_NULLS - does not allow NULL valuesNULLABLE - allows NULL valuesNULLABLE_UNKNOWN - nullability
    * unknown 13. **REMARKS** string => comment describing parameter/column
    *
    * **Note:** Some databases may not return the column descriptions for a procedure. Additional columns beyond REMARKS can be defined by the database.
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param procedureNamePattern a procedure name pattern
    * @param columnNamePattern a column name pattern
    * @returns each row describes a stored procedure parameter or column
    * @throws SQLException if a database access error occurs.
    */
  def getProcedureColumns(catalog: js.Any, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): XResultSet = js.native
  
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getProcedureTerm(): String = js.native
  
  /**
    * Gets a description of the stored procedures available in a catalog.
    *
    * Only procedure descriptions matching the schema and procedure name criteria are returned. They are ordered by PROCEDURE_SCHEM, and PROCEDURE_NAME.
    *
    * Each procedure description has the following columns:
    *
    *  1. **PROCEDURE_CAT** string => procedure catalog (may be `NULL` ) 2. **PROCEDURE_SCHEM** string => procedure schema (may be `NULL` ) 3.
    * **PROCEDURE_NAME** string => procedure name 4. reserved for future use 5. reserved for future use 6. reserved for future use 7. **REMARKS** string =>
    * explanatory comment on the procedure 8. **PROCEDURE_TYPE** short => kind of procedure: UNKNOWN - May return a resultNO - Does not return a
    * resultRETURN - Returns a result
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param procedureNamePattern a procedure name pattern
    * @returns each row is a procedure description
    * @throws SQLException if a database access error occurs.
    */
  def getProcedures(catalog: js.Any, schemaPattern: String, procedureNamePattern: String): XResultSet = js.native
  
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSQLKeywords(): String = js.native
  
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSchemaTerm(): String = js.native
  
  /**
    * Gets the schema names available in this database. The results are ordered by schema name.
    *
    * The schema column is:
    *
    *  1. **TABLE_SCHEM** string => schema name
    * @returns each row has a single String column that is a schema name
    * @throws SQLException if a database access error occurs.
    */
  def getSchemas(): XResultSet = js.native
  
  /**
    * gets the string that can be used to escape wildcard characters. This is the string that can be used to escape "_" or "%" in the string pattern style
    * catalog search parameters.
    *
    * The "_" character represents any single character.
    *
    * The "%" character represents any sequence of zero or more characters.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSearchStringEscape(): String = js.native
  
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getStringFunctions(): String = js.native
  
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSystemFunctions(): String = js.native
  
  /**
    * gets a description of the access rights for each table available in a catalog. Note that a table privilege applies to one or more columns in the
    * table. It would be wrong to assume that this privilege applies to all columns (this may be `TRUE` for some systems but is not `TRUE` for all.)
    *
    * Only privileges matching the schema and table name criteria are returned. They are ordered by TABLE_SCHEM, TABLE_NAME, and PRIVILEGE.
    *
    * Each privilege description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **GRANTOR** => granter of access (may be `NULL` ) 5. **GRANTEE** string => grantee of access 6. **PRIVILEGE** string => name of access
    * (SELECT, INSERT, UPDATE, REFERENCES, ...) 7. **IS_GRANTABLE** string => "YES" if grantee is permitted to grant to others; "NO" if not; `NULL` if
    * unknown
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param tableNamePattern a table name pattern
    * @returns each row is a table privilege description
    * @throws SQLException if a database access error occurs.
    */
  def getTablePrivileges(catalog: js.Any, schemaPattern: String, tableNamePattern: String): XResultSet = js.native
  
  /**
    * gets the table types available in this database. The results are ordered by table type.
    *
    * The table type is:
    *
    *  1. **TABLE_TYPE** string => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
    * @returns each row has a single String column that is a table type
    * @throws SQLException if a database access error occurs.
    */
  def getTableTypes(): XResultSet = js.native
  
  /**
    * gets a description of tables available in a catalog.
    *
    * Only table descriptions matching the catalog, schema, table name, and type criteria are returned. They are ordered by TABLE_TYPE, TABLE_SCHEM, and
    * TABLE_NAME.
    *
    * Each table description has the following columns:
    *
    *  1. **TABLE_CAT** string => table catalog (may be `NULL` ) 2. **TABLE_SCHEM** string => table schema (may be `NULL` ) 3. **TABLE_NAME** string =>
    * table name 4. **TABLE_TYPE** string => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS",
    * "SYNONYM". 5. **REMARKS** string => explanatory comment on the table
    *
    * **Note:** Some databases may not return information for all tables.
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param tableNamePattern a table name pattern
    * @param types a list of table types to include
    * @returns each row is a table description
    * @throws SQLException if a database access error occurs.
    */
  def getTables(catalog: js.Any, schemaPattern: String, tableNamePattern: String, types: SeqEquiv[String]): XResultSet = js.native
  
  /**
    * gets a comma-separated list of time and date functions.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getTimeDateFunctions(): String = js.native
  
  /**
    * gets a description of all the standard SQL types supported by this database. They are ordered by DATA_TYPE and then by how closely the data type maps
    * to the corresponding SDBC SQL type.
    *
    * Each type description has the following columns:
    *
    *  1. **TYPE_NAME** string => Type name 2. **DATA_TYPE** short => SQL data type from java.sql.Types 3. **PRECISION** long => maximum precision 4.
    * **LITERAL_PREFIX** string => prefix used to quote a literal (may be `NULL` ) 5. **LITERAL_SUFFIX** string => suffix used to quote a literal (may be
    * `NULL` ) 6. **CREATE_PARAMS** string => parameters used in creating the type (may be `NULL` ) 7. **NULLABLE** short => can you use NULL for this type?
    * NO_NULLS - does not allow NULL valuesNULLABLE - allows NULL valuesNULLABLE_UNKNOWN - nullability unknown 8. **CASE_SENSITIVE** boolean=> is it case
    * sensitive? 9. **SEARCHABLE** short => can you use "WHERE" based on this type: NONE - No supportCHAR - Only supported with WHERE .. LIKEBASIC -
    * Supported except for WHERE .. LIKEFULL - Supported for all WHERE .. 10. **UNSIGNED_ATTRIBUTE** boolean => is it unsigned? 11. **FIXED_PREC_SCALE**
    * boolean => can it be a money value? 12. **AUTO_INCREMENT** boolean => can it be used for an auto-increment value? 13. **LOCAL_TYPE_NAME** string =>
    * localized version of type name (may be `NULL` ) 14. **MINIMUM_SCALE** short => minimum scale supported 15. **MAXIMUM_SCALE** short => maximum scale
    * supported 16. **SQL_DATA_TYPE** long => unused 17. **SQL_DATETIME_SUB** long => unused 18. **NUM_PREC_RADIX** long => usually 2 or 10
    * @returns each row is a SQL type description
    * @throws SQLException if a database access error occurs.
    */
  def getTypeInfo(): XResultSet = js.native
  
  /**
    * Gets a description of the user-defined types defined in a particular schema. Schema-specific UDTs may have type OBJECT, STRUCT, or DISTINCT.
    *
    * Only types matching the catalog, schema, type name, and type criteria are returned. They are ordered by DATA_TYPE, TYPE_SCHEM, and TYPE_NAME. The type
    * name parameter may be a fully-qualified name. In this case, the catalog and schemaPattern parameters are ignored.
    *
    * Each type description has the following columns:
    *
    *  1. **TYPE_CAT** string => the type's catalog (may be `NULL` ) 2. **TYPE_SCHEM** string => type's schema (may be `NULL` ) 3. **TYPE_NAME** string =>
    * type name 4. **CLASS_NAME** string => Java class name or service name 5. **DATA_TYPE** string => type value. One of OBJECT, STRUCT, or DISTINCT 6.
    * **REMARKS** string => explanatory comment on the type
    *
    * **Note:** If the driver does not support UDTs, an empty result set is returned.
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schemaPattern a schema name pattern; "" retrieves those without a schema
    * @param typeNamePattern a type name pattern; may be a fully-qualified name
    * @param types a list of user-named types to include (OBJECT, STRUCT, or DISTINCT)
    * @returns each row is a type description
    * @throws SQLException if a database access error occurs.
    */
  def getUDTs(catalog: js.Any, schemaPattern: String, typeNamePattern: String, types: SeqEquiv[Double]): XResultSet = js.native
  
  /** returns the URL for the database connection */
  def getURL(): String = js.native
  
  /** returns the user name from this database connection. */
  def getUserName(): String = js.native
  
  /**
    * gets a description of a table's columns that are automatically updated when any value in a row is updated. They are unordered.
    *
    * Each column description has the following columns:
    *
    *  1. **SCOPE** short => is not used 2. **COLUMN_NAME** string => column name 3. **DATA_TYPE** short => SQL data type from java.sql.Types 4.
    * **TYPE_NAME** string => Data source dependent type name 5. **COLUMN_SIZE** long => precision 6. **BUFFER_LENGTH** long => length of column value in
    * bytes 7. **DECIMAL_DIGITS** short => scale 8. **PSEUDO_COLUMN** short => is this a pseudo column like an Oracle ROWID UNKNOWN - may or may not be
    * pseudo columnNOT_PSEUDO - is NOT a pseudo columnPSEUDO - is a pseudo column
    * @param catalog a catalog name; "" retrieves those without a catalog; `VOID` means drop catalog name from the selection criteria
    * @param schema a schema name; "" retrieves those without a schema
    * @param table a table name
    * @returns each row is a column description
    * @throws SQLException if a database access error occurs.
    */
  def getVersionColumns(catalog: js.Any, schema: String, table: String): XResultSet = js.native
  
  /**
    * indicates whether or not a visible row insert can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowInserted()} .()
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def insertsAreDetected(setType: Double): Boolean = js.native
  
  /**
    * Does a catalog appear at the start of a qualified table name? (Otherwise it appears at the end)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCatalogAtStart(): Boolean = js.native
  
  /**
    * checks if the database in read-only mode.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(): Boolean = js.native
  
  /**
    * are concatenations between NULL and non-NULL values NULL?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullPlusNonNullIsNull(): Boolean = js.native
  
  /**
    * Are NULL values sorted at the end, regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtEnd(): Boolean = js.native
  
  /**
    * Are NULL values sorted at the start regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtStart(): Boolean = js.native
  
  /**
    * Are NULL values sorted high?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedHigh(): Boolean = js.native
  
  /**
    * Are NULL values sorted low?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedLow(): Boolean = js.native
  
  /**
    * indicates whether deletes made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersDeletesAreVisible(setType: Double): Boolean = js.native
  
  /**
    * indicates whether inserts made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersInsertsAreVisible(setType: Double): Boolean = js.native
  
  /**
    * indicates whether updates made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersUpdatesAreVisible(setType: Double): Boolean = js.native
  
  /**
    * indicates whether a result set's own deletes are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownDeletesAreVisible(setType: Double): Boolean = js.native
  
  /**
    * indicates whether a result set's own inserts are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownInsertsAreVisible(setType: Double): Boolean = js.native
  
  /**
    * indicates whether a result set's own updates are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownUpdatesAreVisible(setType: Double): Boolean = js.native
  
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseQuotedIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseQuotedIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseQuotedIdentifiers(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if the database supports ANSI92 entry level SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92EntryLevelSQL(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if the database supports ANSI92 full SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92FullSQL(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if the database supports ANSI92 intermediate SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92IntermediateSQL(): Boolean = js.native
  
  /**
    * support the Database "ALTER TABLE" with add column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithAddColumn(): Boolean = js.native
  
  /**
    * support the Database "ALTER TABLE" with drop column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithDropColumn(): Boolean = js.native
  
  /**
    * indicates whether the driver supports batch updates.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsBatchUpdates(): Boolean = js.native
  
  /**
    * Can a catalog name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInDataManipulation(): Boolean = js.native
  
  /**
    * Can a catalog name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInIndexDefinitions(): Boolean = js.native
  
  /**
    * Can a catalog name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInPrivilegeDefinitions(): Boolean = js.native
  
  /**
    * Can a catalog name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInProcedureCalls(): Boolean = js.native
  
  /**
    * Can a catalog name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInTableDefinitions(): Boolean = js.native
  
  /**
    * support the Database column aliasing?
    *
    * The SQL AS clause can be used to provide names for computed columns or to provide alias names for columns as required.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsColumnAliasing(): Boolean = js.native
  
  /**
    * `TRUE` , if the Database supports the CONVERT between the given SQL types otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsConvert(fromType: Double, toType: Double): Boolean = js.native
  
  /**
    * `TRUE` , if the database supports ODBC Core SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCoreSQLGrammar(): Boolean = js.native
  
  /**
    * Are correlated subqueries supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCorrelatedSubqueries(): Boolean = js.native
  
  /**
    * support the Database both data definition and data manipulation statements within a transaction?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataDefinitionAndDataManipulationTransactions(): Boolean = js.native
  
  /**
    * are only data manipulation statements within a transaction supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataManipulationTransactionsOnly(): Boolean = js.native
  
  /**
    * If table correlation names are supported, are they restricted to be different from the names of the tables?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDifferentTableCorrelationNames(): Boolean = js.native
  
  /**
    * Are expressions in "ORDER BY" lists supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExpressionsInOrderBy(): Boolean = js.native
  
  /**
    * `TRUE` , if the database supports ODBC Extended SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExtendedSQLGrammar(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if full nested outer joins are supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsFullOuterJoins(): Boolean = js.native
  
  /**
    * Is some form of "GROUP BY" clause supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupBy(): Boolean = js.native
  
  /**
    * Can a "GROUP BY" clause add columns not in the SELECT provided it specifies all the columns in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByBeyondSelect(): Boolean = js.native
  
  /**
    * Can a "GROUP BY" clause use columns not in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByUnrelated(): Boolean = js.native
  
  /**
    * returns `TRUE` , if the Database supports SQL Integrity Enhancement Facility, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsIntegrityEnhancementFacility(): Boolean = js.native
  
  /**
    * Is the escape character in "LIKE" clauses supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsLikeEscapeClause(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if there is limited support for outer joins. (This will be `TRUE` if supportFullOuterJoins is `TRUE` .) `FALSE` is returned otherwise.
    * @throws SQLException if a database access error occurs.
    */
  def supportsLimitedOuterJoins(): Boolean = js.native
  
  /**
    * `TRUE` , if the database supports ODBC Minimum SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMinimumSQLGrammar(): Boolean = js.native
  
  /**
    * use the database "mixed case unquoted SQL identifiers" case sensitive.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseIdentifiers(): Boolean = js.native
  
  /**
    * Does the database treat mixed case quoted SQL identifiers as case sensitive and as a result store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseQuotedIdentifiers(): Boolean = js.native
  
  /**
    * Are multiple XResultSets from a single execute supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleResultSets(): Boolean = js.native
  
  /**
    * Can we have multiple transactions open at once (on different connections)?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleTransactions(): Boolean = js.native
  
  /**
    * Can columns be defined as non-nullable?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsNonNullableColumns(): Boolean = js.native
  
  /**
    * Can cursors remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossCommit(): Boolean = js.native
  
  /**
    * Can cursors remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossRollback(): Boolean = js.native
  
  /**
    * Can statements remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossCommit(): Boolean = js.native
  
  /**
    * Can statements remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossRollback(): Boolean = js.native
  
  /**
    * Can an "ORDER BY" clause use columns not in the SELECT statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOrderByUnrelated(): Boolean = js.native
  
  /**
    * @returns `TRUE` , if some form of outer join is supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsOuterJoins(): Boolean = js.native
  
  /**
    * Is positioned DELETE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedDelete(): Boolean = js.native
  
  /**
    * Is positioned UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedUpdate(): Boolean = js.native
  
  /**
    * Does the database support the concurrency type in combination with the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @param concurrency defined in {@link com.sun.star.sdbc.ResultSetConcurrency}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetConcurrency(setType: Double, concurrency: Double): Boolean = js.native
  
  /**
    * Does the database support the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetType(setType: Double): Boolean = js.native
  
  /**
    * Can a schema name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInDataManipulation(): Boolean = js.native
  
  /**
    * Can a schema name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInIndexDefinitions(): Boolean = js.native
  
  /**
    * Can a schema name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInPrivilegeDefinitions(): Boolean = js.native
  
  /**
    * Can a schema name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInProcedureCalls(): Boolean = js.native
  
  /**
    * Can a schema name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInTableDefinitions(): Boolean = js.native
  
  /**
    * Is SELECT for UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSelectForUpdate(): Boolean = js.native
  
  /**
    * Are stored procedure calls using the stored procedure escape syntax supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsStoredProcedures(): Boolean = js.native
  
  /**
    * Are subqueries in comparison expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInComparisons(): Boolean = js.native
  
  /**
    * Are subqueries in "exists" expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInExists(): Boolean = js.native
  
  /**
    * Are subqueries in "in" statements supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInIns(): Boolean = js.native
  
  /**
    * Are subqueries in quantified expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInQuantifieds(): Boolean = js.native
  
  /**
    * Are table correlation names supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTableCorrelationNames(): Boolean = js.native
  
  /**
    * Does this database support the given transaction isolation level?
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.Connection
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactionIsolationLevel(level: Double): Boolean = js.native
  
  /**
    * support the Database transactions? If not, invoking the method {@link com.sun.star.sdbc.XConnection.commit()} is a noop and the isolation level is
    * TransactionIsolation_NONE.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactions(): Boolean = js.native
  
  /**
    * `TRUE` , if the Database supports the CONVERT function between SQL types, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTypeConversion(): Boolean = js.native
  
  /**
    * Is SQL UNION supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnion(): Boolean = js.native
  
  /**
    * Is SQL UNION ALL supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnionAll(): Boolean = js.native
  
  /**
    * indicates whether or not a visible row update can be detected by calling the method `XResultSet.rowUpdated` .
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def updatesAreDetected(setType: Double): Boolean = js.native
  
  /**
    * use the database one local file to save for each table.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFilePerTable(): Boolean = js.native
  
  /**
    * use the database local files to save the tables.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFiles(): Boolean = js.native
}
object XDatabaseMetaData {
  
  @scala.inline
  def apply(
    CatalogSeparator: String,
    CatalogTerm: String,
    Catalogs: XResultSet,
    Connection: XConnection,
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
  ): XDatabaseMetaData = {
    val __obj = js.Dynamic.literal(CatalogSeparator = CatalogSeparator.asInstanceOf[js.Any], CatalogTerm = CatalogTerm.asInstanceOf[js.Any], Catalogs = Catalogs.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], DatabaseProductName = DatabaseProductName.asInstanceOf[js.Any], DatabaseProductVersion = DatabaseProductVersion.asInstanceOf[js.Any], DefaultTransactionIsolation = DefaultTransactionIsolation.asInstanceOf[js.Any], DriverMajorVersion = DriverMajorVersion.asInstanceOf[js.Any], DriverMinorVersion = DriverMinorVersion.asInstanceOf[js.Any], DriverName = DriverName.asInstanceOf[js.Any], DriverVersion = DriverVersion.asInstanceOf[js.Any], ExtraNameCharacters = ExtraNameCharacters.asInstanceOf[js.Any], IdentifierQuoteString = IdentifierQuoteString.asInstanceOf[js.Any], MaxBinaryLiteralLength = MaxBinaryLiteralLength.asInstanceOf[js.Any], MaxCatalogNameLength = MaxCatalogNameLength.asInstanceOf[js.Any], MaxCharLiteralLength = MaxCharLiteralLength.asInstanceOf[js.Any], MaxColumnNameLength = MaxColumnNameLength.asInstanceOf[js.Any], MaxColumnsInGroupBy = MaxColumnsInGroupBy.asInstanceOf[js.Any], MaxColumnsInIndex = MaxColumnsInIndex.asInstanceOf[js.Any], MaxColumnsInOrderBy = MaxColumnsInOrderBy.asInstanceOf[js.Any], MaxColumnsInSelect = MaxColumnsInSelect.asInstanceOf[js.Any], MaxColumnsInTable = MaxColumnsInTable.asInstanceOf[js.Any], MaxConnections = MaxConnections.asInstanceOf[js.Any], MaxCursorNameLength = MaxCursorNameLength.asInstanceOf[js.Any], MaxIndexLength = MaxIndexLength.asInstanceOf[js.Any], MaxProcedureNameLength = MaxProcedureNameLength.asInstanceOf[js.Any], MaxRowSize = MaxRowSize.asInstanceOf[js.Any], MaxSchemaNameLength = MaxSchemaNameLength.asInstanceOf[js.Any], MaxStatementLength = MaxStatementLength.asInstanceOf[js.Any], MaxStatements = MaxStatements.asInstanceOf[js.Any], MaxTableNameLength = MaxTableNameLength.asInstanceOf[js.Any], MaxTablesInSelect = MaxTablesInSelect.asInstanceOf[js.Any], MaxUserNameLength = MaxUserNameLength.asInstanceOf[js.Any], NumericFunctions = NumericFunctions.asInstanceOf[js.Any], ProcedureTerm = ProcedureTerm.asInstanceOf[js.Any], SQLKeywords = SQLKeywords.asInstanceOf[js.Any], SchemaTerm = SchemaTerm.asInstanceOf[js.Any], Schemas = Schemas.asInstanceOf[js.Any], SearchStringEscape = SearchStringEscape.asInstanceOf[js.Any], StringFunctions = StringFunctions.asInstanceOf[js.Any], SystemFunctions = SystemFunctions.asInstanceOf[js.Any], TableTypes = TableTypes.asInstanceOf[js.Any], TimeDateFunctions = TimeDateFunctions.asInstanceOf[js.Any], TypeInfo = TypeInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), allProceduresAreCallable = js.Any.fromFunction0(allProceduresAreCallable), allTablesAreSelectable = js.Any.fromFunction0(allTablesAreSelectable), dataDefinitionCausesTransactionCommit = js.Any.fromFunction0(dataDefinitionCausesTransactionCommit), dataDefinitionIgnoredInTransactions = js.Any.fromFunction0(dataDefinitionIgnoredInTransactions), deletesAreDetected = js.Any.fromFunction1(deletesAreDetected), doesMaxRowSizeIncludeBlobs = js.Any.fromFunction0(doesMaxRowSizeIncludeBlobs), getBestRowIdentifier = js.Any.fromFunction5(getBestRowIdentifier), getCatalogSeparator = js.Any.fromFunction0(getCatalogSeparator), getCatalogTerm = js.Any.fromFunction0(getCatalogTerm), getCatalogs = js.Any.fromFunction0(getCatalogs), getColumnPrivileges = js.Any.fromFunction4(getColumnPrivileges), getColumns = js.Any.fromFunction4(getColumns), getConnection = js.Any.fromFunction0(getConnection), getCrossReference = js.Any.fromFunction6(getCrossReference), getDatabaseProductName = js.Any.fromFunction0(getDatabaseProductName), getDatabaseProductVersion = js.Any.fromFunction0(getDatabaseProductVersion), getDefaultTransactionIsolation = js.Any.fromFunction0(getDefaultTransactionIsolation), getDriverMajorVersion = js.Any.fromFunction0(getDriverMajorVersion), getDriverMinorVersion = js.Any.fromFunction0(getDriverMinorVersion), getDriverName = js.Any.fromFunction0(getDriverName), getDriverVersion = js.Any.fromFunction0(getDriverVersion), getExportedKeys = js.Any.fromFunction3(getExportedKeys), getExtraNameCharacters = js.Any.fromFunction0(getExtraNameCharacters), getIdentifierQuoteString = js.Any.fromFunction0(getIdentifierQuoteString), getImportedKeys = js.Any.fromFunction3(getImportedKeys), getIndexInfo = js.Any.fromFunction5(getIndexInfo), getMaxBinaryLiteralLength = js.Any.fromFunction0(getMaxBinaryLiteralLength), getMaxCatalogNameLength = js.Any.fromFunction0(getMaxCatalogNameLength), getMaxCharLiteralLength = js.Any.fromFunction0(getMaxCharLiteralLength), getMaxColumnNameLength = js.Any.fromFunction0(getMaxColumnNameLength), getMaxColumnsInGroupBy = js.Any.fromFunction0(getMaxColumnsInGroupBy), getMaxColumnsInIndex = js.Any.fromFunction0(getMaxColumnsInIndex), getMaxColumnsInOrderBy = js.Any.fromFunction0(getMaxColumnsInOrderBy), getMaxColumnsInSelect = js.Any.fromFunction0(getMaxColumnsInSelect), getMaxColumnsInTable = js.Any.fromFunction0(getMaxColumnsInTable), getMaxConnections = js.Any.fromFunction0(getMaxConnections), getMaxCursorNameLength = js.Any.fromFunction0(getMaxCursorNameLength), getMaxIndexLength = js.Any.fromFunction0(getMaxIndexLength), getMaxProcedureNameLength = js.Any.fromFunction0(getMaxProcedureNameLength), getMaxRowSize = js.Any.fromFunction0(getMaxRowSize), getMaxSchemaNameLength = js.Any.fromFunction0(getMaxSchemaNameLength), getMaxStatementLength = js.Any.fromFunction0(getMaxStatementLength), getMaxStatements = js.Any.fromFunction0(getMaxStatements), getMaxTableNameLength = js.Any.fromFunction0(getMaxTableNameLength), getMaxTablesInSelect = js.Any.fromFunction0(getMaxTablesInSelect), getMaxUserNameLength = js.Any.fromFunction0(getMaxUserNameLength), getNumericFunctions = js.Any.fromFunction0(getNumericFunctions), getPrimaryKeys = js.Any.fromFunction3(getPrimaryKeys), getProcedureColumns = js.Any.fromFunction4(getProcedureColumns), getProcedureTerm = js.Any.fromFunction0(getProcedureTerm), getProcedures = js.Any.fromFunction3(getProcedures), getSQLKeywords = js.Any.fromFunction0(getSQLKeywords), getSchemaTerm = js.Any.fromFunction0(getSchemaTerm), getSchemas = js.Any.fromFunction0(getSchemas), getSearchStringEscape = js.Any.fromFunction0(getSearchStringEscape), getStringFunctions = js.Any.fromFunction0(getStringFunctions), getSystemFunctions = js.Any.fromFunction0(getSystemFunctions), getTablePrivileges = js.Any.fromFunction3(getTablePrivileges), getTableTypes = js.Any.fromFunction0(getTableTypes), getTables = js.Any.fromFunction4(getTables), getTimeDateFunctions = js.Any.fromFunction0(getTimeDateFunctions), getTypeInfo = js.Any.fromFunction0(getTypeInfo), getUDTs = js.Any.fromFunction4(getUDTs), getURL = js.Any.fromFunction0(getURL), getUserName = js.Any.fromFunction0(getUserName), getVersionColumns = js.Any.fromFunction3(getVersionColumns), insertsAreDetected = js.Any.fromFunction1(insertsAreDetected), isCatalogAtStart = js.Any.fromFunction0(isCatalogAtStart), isReadOnly = js.Any.fromFunction0(isReadOnly), nullPlusNonNullIsNull = js.Any.fromFunction0(nullPlusNonNullIsNull), nullsAreSortedAtEnd = js.Any.fromFunction0(nullsAreSortedAtEnd), nullsAreSortedAtStart = js.Any.fromFunction0(nullsAreSortedAtStart), nullsAreSortedHigh = js.Any.fromFunction0(nullsAreSortedHigh), nullsAreSortedLow = js.Any.fromFunction0(nullsAreSortedLow), othersDeletesAreVisible = js.Any.fromFunction1(othersDeletesAreVisible), othersInsertsAreVisible = js.Any.fromFunction1(othersInsertsAreVisible), othersUpdatesAreVisible = js.Any.fromFunction1(othersUpdatesAreVisible), ownDeletesAreVisible = js.Any.fromFunction1(ownDeletesAreVisible), ownInsertsAreVisible = js.Any.fromFunction1(ownInsertsAreVisible), ownUpdatesAreVisible = js.Any.fromFunction1(ownUpdatesAreVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), storesLowerCaseIdentifiers = js.Any.fromFunction0(storesLowerCaseIdentifiers), storesLowerCaseQuotedIdentifiers = js.Any.fromFunction0(storesLowerCaseQuotedIdentifiers), storesMixedCaseIdentifiers = js.Any.fromFunction0(storesMixedCaseIdentifiers), storesMixedCaseQuotedIdentifiers = js.Any.fromFunction0(storesMixedCaseQuotedIdentifiers), storesUpperCaseIdentifiers = js.Any.fromFunction0(storesUpperCaseIdentifiers), storesUpperCaseQuotedIdentifiers = js.Any.fromFunction0(storesUpperCaseQuotedIdentifiers), supportsANSI92EntryLevelSQL = js.Any.fromFunction0(supportsANSI92EntryLevelSQL), supportsANSI92FullSQL = js.Any.fromFunction0(supportsANSI92FullSQL), supportsANSI92IntermediateSQL = js.Any.fromFunction0(supportsANSI92IntermediateSQL), supportsAlterTableWithAddColumn = js.Any.fromFunction0(supportsAlterTableWithAddColumn), supportsAlterTableWithDropColumn = js.Any.fromFunction0(supportsAlterTableWithDropColumn), supportsBatchUpdates = js.Any.fromFunction0(supportsBatchUpdates), supportsCatalogsInDataManipulation = js.Any.fromFunction0(supportsCatalogsInDataManipulation), supportsCatalogsInIndexDefinitions = js.Any.fromFunction0(supportsCatalogsInIndexDefinitions), supportsCatalogsInPrivilegeDefinitions = js.Any.fromFunction0(supportsCatalogsInPrivilegeDefinitions), supportsCatalogsInProcedureCalls = js.Any.fromFunction0(supportsCatalogsInProcedureCalls), supportsCatalogsInTableDefinitions = js.Any.fromFunction0(supportsCatalogsInTableDefinitions), supportsColumnAliasing = js.Any.fromFunction0(supportsColumnAliasing), supportsConvert = js.Any.fromFunction2(supportsConvert), supportsCoreSQLGrammar = js.Any.fromFunction0(supportsCoreSQLGrammar), supportsCorrelatedSubqueries = js.Any.fromFunction0(supportsCorrelatedSubqueries), supportsDataDefinitionAndDataManipulationTransactions = js.Any.fromFunction0(supportsDataDefinitionAndDataManipulationTransactions), supportsDataManipulationTransactionsOnly = js.Any.fromFunction0(supportsDataManipulationTransactionsOnly), supportsDifferentTableCorrelationNames = js.Any.fromFunction0(supportsDifferentTableCorrelationNames), supportsExpressionsInOrderBy = js.Any.fromFunction0(supportsExpressionsInOrderBy), supportsExtendedSQLGrammar = js.Any.fromFunction0(supportsExtendedSQLGrammar), supportsFullOuterJoins = js.Any.fromFunction0(supportsFullOuterJoins), supportsGroupBy = js.Any.fromFunction0(supportsGroupBy), supportsGroupByBeyondSelect = js.Any.fromFunction0(supportsGroupByBeyondSelect), supportsGroupByUnrelated = js.Any.fromFunction0(supportsGroupByUnrelated), supportsIntegrityEnhancementFacility = js.Any.fromFunction0(supportsIntegrityEnhancementFacility), supportsLikeEscapeClause = js.Any.fromFunction0(supportsLikeEscapeClause), supportsLimitedOuterJoins = js.Any.fromFunction0(supportsLimitedOuterJoins), supportsMinimumSQLGrammar = js.Any.fromFunction0(supportsMinimumSQLGrammar), supportsMixedCaseIdentifiers = js.Any.fromFunction0(supportsMixedCaseIdentifiers), supportsMixedCaseQuotedIdentifiers = js.Any.fromFunction0(supportsMixedCaseQuotedIdentifiers), supportsMultipleResultSets = js.Any.fromFunction0(supportsMultipleResultSets), supportsMultipleTransactions = js.Any.fromFunction0(supportsMultipleTransactions), supportsNonNullableColumns = js.Any.fromFunction0(supportsNonNullableColumns), supportsOpenCursorsAcrossCommit = js.Any.fromFunction0(supportsOpenCursorsAcrossCommit), supportsOpenCursorsAcrossRollback = js.Any.fromFunction0(supportsOpenCursorsAcrossRollback), supportsOpenStatementsAcrossCommit = js.Any.fromFunction0(supportsOpenStatementsAcrossCommit), supportsOpenStatementsAcrossRollback = js.Any.fromFunction0(supportsOpenStatementsAcrossRollback), supportsOrderByUnrelated = js.Any.fromFunction0(supportsOrderByUnrelated), supportsOuterJoins = js.Any.fromFunction0(supportsOuterJoins), supportsPositionedDelete = js.Any.fromFunction0(supportsPositionedDelete), supportsPositionedUpdate = js.Any.fromFunction0(supportsPositionedUpdate), supportsResultSetConcurrency = js.Any.fromFunction2(supportsResultSetConcurrency), supportsResultSetType = js.Any.fromFunction1(supportsResultSetType), supportsSchemasInDataManipulation = js.Any.fromFunction0(supportsSchemasInDataManipulation), supportsSchemasInIndexDefinitions = js.Any.fromFunction0(supportsSchemasInIndexDefinitions), supportsSchemasInPrivilegeDefinitions = js.Any.fromFunction0(supportsSchemasInPrivilegeDefinitions), supportsSchemasInProcedureCalls = js.Any.fromFunction0(supportsSchemasInProcedureCalls), supportsSchemasInTableDefinitions = js.Any.fromFunction0(supportsSchemasInTableDefinitions), supportsSelectForUpdate = js.Any.fromFunction0(supportsSelectForUpdate), supportsStoredProcedures = js.Any.fromFunction0(supportsStoredProcedures), supportsSubqueriesInComparisons = js.Any.fromFunction0(supportsSubqueriesInComparisons), supportsSubqueriesInExists = js.Any.fromFunction0(supportsSubqueriesInExists), supportsSubqueriesInIns = js.Any.fromFunction0(supportsSubqueriesInIns), supportsSubqueriesInQuantifieds = js.Any.fromFunction0(supportsSubqueriesInQuantifieds), supportsTableCorrelationNames = js.Any.fromFunction0(supportsTableCorrelationNames), supportsTransactionIsolationLevel = js.Any.fromFunction1(supportsTransactionIsolationLevel), supportsTransactions = js.Any.fromFunction0(supportsTransactions), supportsTypeConversion = js.Any.fromFunction0(supportsTypeConversion), supportsUnion = js.Any.fromFunction0(supportsUnion), supportsUnionAll = js.Any.fromFunction0(supportsUnionAll), updatesAreDetected = js.Any.fromFunction1(updatesAreDetected), usesLocalFilePerTable = js.Any.fromFunction0(usesLocalFilePerTable), usesLocalFiles = js.Any.fromFunction0(usesLocalFiles))
    __obj.asInstanceOf[XDatabaseMetaData]
  }
  
  @scala.inline
  implicit class XDatabaseMetaDataOps[Self <: XDatabaseMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalogSeparator(value: String): Self = this.set("CatalogSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogTerm(value: String): Self = this.set("CatalogTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogs(value: XResultSet): Self = this.set("Catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: XConnection): Self = this.set("Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseProductName(value: String): Self = this.set("DatabaseProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseProductVersion(value: String): Self = this.set("DatabaseProductVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTransactionIsolation(value: Double): Self = this.set("DefaultTransactionIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverMajorVersion(value: Double): Self = this.set("DriverMajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverMinorVersion(value: Double): Self = this.set("DriverMinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverName(value: String): Self = this.set("DriverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverVersion(value: String): Self = this.set("DriverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraNameCharacters(value: String): Self = this.set("ExtraNameCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierQuoteString(value: String): Self = this.set("IdentifierQuoteString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBinaryLiteralLength(value: Double): Self = this.set("MaxBinaryLiteralLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCatalogNameLength(value: Double): Self = this.set("MaxCatalogNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCharLiteralLength(value: Double): Self = this.set("MaxCharLiteralLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnNameLength(value: Double): Self = this.set("MaxColumnNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnsInGroupBy(value: Double): Self = this.set("MaxColumnsInGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnsInIndex(value: Double): Self = this.set("MaxColumnsInIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnsInOrderBy(value: Double): Self = this.set("MaxColumnsInOrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnsInSelect(value: Double): Self = this.set("MaxColumnsInSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumnsInTable(value: Double): Self = this.set("MaxColumnsInTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("MaxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCursorNameLength(value: Double): Self = this.set("MaxCursorNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIndexLength(value: Double): Self = this.set("MaxIndexLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxProcedureNameLength(value: Double): Self = this.set("MaxProcedureNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowSize(value: Double): Self = this.set("MaxRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSchemaNameLength(value: Double): Self = this.set("MaxSchemaNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStatementLength(value: Double): Self = this.set("MaxStatementLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStatements(value: Double): Self = this.set("MaxStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTableNameLength(value: Double): Self = this.set("MaxTableNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTablesInSelect(value: Double): Self = this.set("MaxTablesInSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUserNameLength(value: Double): Self = this.set("MaxUserNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericFunctions(value: String): Self = this.set("NumericFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureTerm(value: String): Self = this.set("ProcedureTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSQLKeywords(value: String): Self = this.set("SQLKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaTerm(value: String): Self = this.set("SchemaTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: XResultSet): Self = this.set("Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringEscape(value: String): Self = this.set("SearchStringEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringFunctions(value: String): Self = this.set("StringFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemFunctions(value: String): Self = this.set("SystemFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableTypes(value: XResultSet): Self = this.set("TableTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDateFunctions(value: String): Self = this.set("TimeDateFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfo(value: XResultSet): Self = this.set("TypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllProceduresAreCallable(value: () => Boolean): Self = this.set("allProceduresAreCallable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllTablesAreSelectable(value: () => Boolean): Self = this.set("allTablesAreSelectable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataDefinitionCausesTransactionCommit(value: () => Boolean): Self = this.set("dataDefinitionCausesTransactionCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataDefinitionIgnoredInTransactions(value: () => Boolean): Self = this.set("dataDefinitionIgnoredInTransactions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeletesAreDetected(value: Double => Boolean): Self = this.set("deletesAreDetected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoesMaxRowSizeIncludeBlobs(value: () => Boolean): Self = this.set("doesMaxRowSizeIncludeBlobs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBestRowIdentifier(value: (js.Any, String, String, Double, Boolean) => XResultSet): Self = this.set("getBestRowIdentifier", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetCatalogSeparator(value: () => String): Self = this.set("getCatalogSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCatalogTerm(value: () => String): Self = this.set("getCatalogTerm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCatalogs(value: () => XResultSet): Self = this.set("getCatalogs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumnPrivileges(value: (js.Any, String, String, String) => XResultSet): Self = this.set("getColumnPrivileges", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetColumns(value: (js.Any, String, String, String) => XResultSet): Self = this.set("getColumns", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetConnection(value: () => XConnection): Self = this.set("getConnection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCrossReference(value: (js.Any, String, String, js.Any, String, String) => XResultSet): Self = this.set("getCrossReference", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetDatabaseProductName(value: () => String): Self = this.set("getDatabaseProductName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDatabaseProductVersion(value: () => String): Self = this.set("getDatabaseProductVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTransactionIsolation(value: () => Double): Self = this.set("getDefaultTransactionIsolation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDriverMajorVersion(value: () => Double): Self = this.set("getDriverMajorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDriverMinorVersion(value: () => Double): Self = this.set("getDriverMinorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDriverName(value: () => String): Self = this.set("getDriverName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDriverVersion(value: () => String): Self = this.set("getDriverVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExportedKeys(value: (js.Any, String, String) => XResultSet): Self = this.set("getExportedKeys", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetExtraNameCharacters(value: () => String): Self = this.set("getExtraNameCharacters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdentifierQuoteString(value: () => String): Self = this.set("getIdentifierQuoteString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImportedKeys(value: (js.Any, String, String) => XResultSet): Self = this.set("getImportedKeys", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIndexInfo(value: (js.Any, String, String, Boolean, Boolean) => XResultSet): Self = this.set("getIndexInfo", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetMaxBinaryLiteralLength(value: () => Double): Self = this.set("getMaxBinaryLiteralLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxCatalogNameLength(value: () => Double): Self = this.set("getMaxCatalogNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxCharLiteralLength(value: () => Double): Self = this.set("getMaxCharLiteralLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnNameLength(value: () => Double): Self = this.set("getMaxColumnNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnsInGroupBy(value: () => Double): Self = this.set("getMaxColumnsInGroupBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnsInIndex(value: () => Double): Self = this.set("getMaxColumnsInIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnsInOrderBy(value: () => Double): Self = this.set("getMaxColumnsInOrderBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnsInSelect(value: () => Double): Self = this.set("getMaxColumnsInSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxColumnsInTable(value: () => Double): Self = this.set("getMaxColumnsInTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxConnections(value: () => Double): Self = this.set("getMaxConnections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxCursorNameLength(value: () => Double): Self = this.set("getMaxCursorNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxIndexLength(value: () => Double): Self = this.set("getMaxIndexLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxProcedureNameLength(value: () => Double): Self = this.set("getMaxProcedureNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxRowSize(value: () => Double): Self = this.set("getMaxRowSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxSchemaNameLength(value: () => Double): Self = this.set("getMaxSchemaNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxStatementLength(value: () => Double): Self = this.set("getMaxStatementLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxStatements(value: () => Double): Self = this.set("getMaxStatements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxTableNameLength(value: () => Double): Self = this.set("getMaxTableNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxTablesInSelect(value: () => Double): Self = this.set("getMaxTablesInSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxUserNameLength(value: () => Double): Self = this.set("getMaxUserNameLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumericFunctions(value: () => String): Self = this.set("getNumericFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrimaryKeys(value: (js.Any, String, String) => XResultSet): Self = this.set("getPrimaryKeys", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetProcedureColumns(value: (js.Any, String, String, String) => XResultSet): Self = this.set("getProcedureColumns", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetProcedureTerm(value: () => String): Self = this.set("getProcedureTerm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProcedures(value: (js.Any, String, String) => XResultSet): Self = this.set("getProcedures", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSQLKeywords(value: () => String): Self = this.set("getSQLKeywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSchemaTerm(value: () => String): Self = this.set("getSchemaTerm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSchemas(value: () => XResultSet): Self = this.set("getSchemas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSearchStringEscape(value: () => String): Self = this.set("getSearchStringEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStringFunctions(value: () => String): Self = this.set("getStringFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSystemFunctions(value: () => String): Self = this.set("getSystemFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTablePrivileges(value: (js.Any, String, String) => XResultSet): Self = this.set("getTablePrivileges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetTableTypes(value: () => XResultSet): Self = this.set("getTableTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTables(value: (js.Any, String, String, SeqEquiv[String]) => XResultSet): Self = this.set("getTables", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetTimeDateFunctions(value: () => String): Self = this.set("getTimeDateFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeInfo(value: () => XResultSet): Self = this.set("getTypeInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUDTs(value: (js.Any, String, String, SeqEquiv[Double]) => XResultSet): Self = this.set("getUDTs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserName(value: () => String): Self = this.set("getUserName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersionColumns(value: (js.Any, String, String) => XResultSet): Self = this.set("getVersionColumns", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertsAreDetected(value: Double => Boolean): Self = this.set("insertsAreDetected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCatalogAtStart(value: () => Boolean): Self = this.set("isCatalogAtStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNullPlusNonNullIsNull(value: () => Boolean): Self = this.set("nullPlusNonNullIsNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNullsAreSortedAtEnd(value: () => Boolean): Self = this.set("nullsAreSortedAtEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNullsAreSortedAtStart(value: () => Boolean): Self = this.set("nullsAreSortedAtStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNullsAreSortedHigh(value: () => Boolean): Self = this.set("nullsAreSortedHigh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNullsAreSortedLow(value: () => Boolean): Self = this.set("nullsAreSortedLow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOthersDeletesAreVisible(value: Double => Boolean): Self = this.set("othersDeletesAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOthersInsertsAreVisible(value: Double => Boolean): Self = this.set("othersInsertsAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOthersUpdatesAreVisible(value: Double => Boolean): Self = this.set("othersUpdatesAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOwnDeletesAreVisible(value: Double => Boolean): Self = this.set("ownDeletesAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOwnInsertsAreVisible(value: Double => Boolean): Self = this.set("ownInsertsAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOwnUpdatesAreVisible(value: Double => Boolean): Self = this.set("ownUpdatesAreVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoresLowerCaseIdentifiers(value: () => Boolean): Self = this.set("storesLowerCaseIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoresLowerCaseQuotedIdentifiers(value: () => Boolean): Self = this.set("storesLowerCaseQuotedIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoresMixedCaseIdentifiers(value: () => Boolean): Self = this.set("storesMixedCaseIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoresMixedCaseQuotedIdentifiers(value: () => Boolean): Self = this.set("storesMixedCaseQuotedIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoresUpperCaseIdentifiers(value: () => Boolean): Self = this.set("storesUpperCaseIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoresUpperCaseQuotedIdentifiers(value: () => Boolean): Self = this.set("storesUpperCaseQuotedIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsANSI92EntryLevelSQL(value: () => Boolean): Self = this.set("supportsANSI92EntryLevelSQL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsANSI92FullSQL(value: () => Boolean): Self = this.set("supportsANSI92FullSQL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsANSI92IntermediateSQL(value: () => Boolean): Self = this.set("supportsANSI92IntermediateSQL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsAlterTableWithAddColumn(value: () => Boolean): Self = this.set("supportsAlterTableWithAddColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsAlterTableWithDropColumn(value: () => Boolean): Self = this.set("supportsAlterTableWithDropColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsBatchUpdates(value: () => Boolean): Self = this.set("supportsBatchUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCatalogsInDataManipulation(value: () => Boolean): Self = this.set("supportsCatalogsInDataManipulation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCatalogsInIndexDefinitions(value: () => Boolean): Self = this.set("supportsCatalogsInIndexDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCatalogsInPrivilegeDefinitions(value: () => Boolean): Self = this.set("supportsCatalogsInPrivilegeDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCatalogsInProcedureCalls(value: () => Boolean): Self = this.set("supportsCatalogsInProcedureCalls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCatalogsInTableDefinitions(value: () => Boolean): Self = this.set("supportsCatalogsInTableDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsColumnAliasing(value: () => Boolean): Self = this.set("supportsColumnAliasing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsConvert(value: (Double, Double) => Boolean): Self = this.set("supportsConvert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSupportsCoreSQLGrammar(value: () => Boolean): Self = this.set("supportsCoreSQLGrammar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsCorrelatedSubqueries(value: () => Boolean): Self = this.set("supportsCorrelatedSubqueries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsDataDefinitionAndDataManipulationTransactions(value: () => Boolean): Self = this.set("supportsDataDefinitionAndDataManipulationTransactions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsDataManipulationTransactionsOnly(value: () => Boolean): Self = this.set("supportsDataManipulationTransactionsOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsDifferentTableCorrelationNames(value: () => Boolean): Self = this.set("supportsDifferentTableCorrelationNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsExpressionsInOrderBy(value: () => Boolean): Self = this.set("supportsExpressionsInOrderBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsExtendedSQLGrammar(value: () => Boolean): Self = this.set("supportsExtendedSQLGrammar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsFullOuterJoins(value: () => Boolean): Self = this.set("supportsFullOuterJoins", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsGroupBy(value: () => Boolean): Self = this.set("supportsGroupBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsGroupByBeyondSelect(value: () => Boolean): Self = this.set("supportsGroupByBeyondSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsGroupByUnrelated(value: () => Boolean): Self = this.set("supportsGroupByUnrelated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsIntegrityEnhancementFacility(value: () => Boolean): Self = this.set("supportsIntegrityEnhancementFacility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsLikeEscapeClause(value: () => Boolean): Self = this.set("supportsLikeEscapeClause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsLimitedOuterJoins(value: () => Boolean): Self = this.set("supportsLimitedOuterJoins", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsMinimumSQLGrammar(value: () => Boolean): Self = this.set("supportsMinimumSQLGrammar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsMixedCaseIdentifiers(value: () => Boolean): Self = this.set("supportsMixedCaseIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsMixedCaseQuotedIdentifiers(value: () => Boolean): Self = this.set("supportsMixedCaseQuotedIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsMultipleResultSets(value: () => Boolean): Self = this.set("supportsMultipleResultSets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsMultipleTransactions(value: () => Boolean): Self = this.set("supportsMultipleTransactions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsNonNullableColumns(value: () => Boolean): Self = this.set("supportsNonNullableColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOpenCursorsAcrossCommit(value: () => Boolean): Self = this.set("supportsOpenCursorsAcrossCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOpenCursorsAcrossRollback(value: () => Boolean): Self = this.set("supportsOpenCursorsAcrossRollback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOpenStatementsAcrossCommit(value: () => Boolean): Self = this.set("supportsOpenStatementsAcrossCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOpenStatementsAcrossRollback(value: () => Boolean): Self = this.set("supportsOpenStatementsAcrossRollback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOrderByUnrelated(value: () => Boolean): Self = this.set("supportsOrderByUnrelated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsOuterJoins(value: () => Boolean): Self = this.set("supportsOuterJoins", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsPositionedDelete(value: () => Boolean): Self = this.set("supportsPositionedDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsPositionedUpdate(value: () => Boolean): Self = this.set("supportsPositionedUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsResultSetConcurrency(value: (Double, Double) => Boolean): Self = this.set("supportsResultSetConcurrency", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSupportsResultSetType(value: Double => Boolean): Self = this.set("supportsResultSetType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportsSchemasInDataManipulation(value: () => Boolean): Self = this.set("supportsSchemasInDataManipulation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSchemasInIndexDefinitions(value: () => Boolean): Self = this.set("supportsSchemasInIndexDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSchemasInPrivilegeDefinitions(value: () => Boolean): Self = this.set("supportsSchemasInPrivilegeDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSchemasInProcedureCalls(value: () => Boolean): Self = this.set("supportsSchemasInProcedureCalls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSchemasInTableDefinitions(value: () => Boolean): Self = this.set("supportsSchemasInTableDefinitions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSelectForUpdate(value: () => Boolean): Self = this.set("supportsSelectForUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsStoredProcedures(value: () => Boolean): Self = this.set("supportsStoredProcedures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSubqueriesInComparisons(value: () => Boolean): Self = this.set("supportsSubqueriesInComparisons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSubqueriesInExists(value: () => Boolean): Self = this.set("supportsSubqueriesInExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSubqueriesInIns(value: () => Boolean): Self = this.set("supportsSubqueriesInIns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsSubqueriesInQuantifieds(value: () => Boolean): Self = this.set("supportsSubqueriesInQuantifieds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsTableCorrelationNames(value: () => Boolean): Self = this.set("supportsTableCorrelationNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsTransactionIsolationLevel(value: Double => Boolean): Self = this.set("supportsTransactionIsolationLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportsTransactions(value: () => Boolean): Self = this.set("supportsTransactions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsTypeConversion(value: () => Boolean): Self = this.set("supportsTypeConversion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsUnion(value: () => Boolean): Self = this.set("supportsUnion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportsUnionAll(value: () => Boolean): Self = this.set("supportsUnionAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdatesAreDetected(value: Double => Boolean): Self = this.set("updatesAreDetected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsesLocalFilePerTable(value: () => Boolean): Self = this.set("usesLocalFilePerTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsesLocalFiles(value: () => Boolean): Self = this.set("usesLocalFiles", js.Any.fromFunction0(value))
  }
}
