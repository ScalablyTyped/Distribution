package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XDatabaseMetaData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogSeparator: java.lang.String
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogTerm: java.lang.String
  /**
    * gets the catalog names available in this database. The results are ordered by catalog name.
    *
    * The catalog column is:
    *
    *  1. **TABLE_CAT** string => catalog name
    * @returns each row has a single String column that is a catalog name
    * @throws SQLException if a database access error occurs.
    */
  val Catalogs: XResultSet
  /**
    * retrieves the connection that produced this metadata object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  val Connection: XConnection
  /** returns the name of the database product. */
  val DatabaseProductName: java.lang.String
  /** returns the version of the database product. */
  val DatabaseProductVersion: java.lang.String
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  val DefaultTransactionIsolation: scala.Double
  /** returns the SDBC driver major version number. */
  val DriverMajorVersion: scala.Double
  /** returns the SDBC driver minor version number. */
  val DriverMinorVersion: scala.Double
  /** returns the name of the SDBC driver. */
  val DriverName: java.lang.String
  /** returns the version number of the SDBC driver. */
  val DriverVersion: java.lang.String
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ExtraNameCharacters: java.lang.String
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val IdentifierQuoteString: java.lang.String
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxBinaryLiteralLength: scala.Double
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCatalogNameLength: scala.Double
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCharLiteralLength: scala.Double
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnNameLength: scala.Double
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInGroupBy: scala.Double
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInIndex: scala.Double
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInOrderBy: scala.Double
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInSelect: scala.Double
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInTable: scala.Double
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxConnections: scala.Double
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCursorNameLength: scala.Double
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxIndexLength: scala.Double
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxProcedureNameLength: scala.Double
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxRowSize: scala.Double
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxSchemaNameLength: scala.Double
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatementLength: scala.Double
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatements: scala.Double
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTableNameLength: scala.Double
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTablesInSelect: scala.Double
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxUserNameLength: scala.Double
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val NumericFunctions: java.lang.String
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ProcedureTerm: java.lang.String
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SQLKeywords: java.lang.String
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SchemaTerm: java.lang.String
  /**
    * Gets the schema names available in this database. The results are ordered by schema name.
    *
    * The schema column is:
    *
    *  1. **TABLE_SCHEM** string => schema name
    * @returns each row has a single String column that is a schema name
    * @throws SQLException if a database access error occurs.
    */
  val Schemas: XResultSet
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
  val SearchStringEscape: java.lang.String
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val StringFunctions: java.lang.String
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SystemFunctions: java.lang.String
  /**
    * gets the table types available in this database. The results are ordered by table type.
    *
    * The table type is:
    *
    *  1. **TABLE_TYPE** string => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
    * @returns each row has a single String column that is a table type
    * @throws SQLException if a database access error occurs.
    */
  val TableTypes: XResultSet
  /**
    * gets a comma-separated list of time and date functions.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val TimeDateFunctions: java.lang.String
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
  val TypeInfo: XResultSet
  /** returns the URL for the database connection */
  val URL: java.lang.String
  /** returns the user name from this database connection. */
  val UserName: java.lang.String
  /**
    * Can all the procedures returned by getProcedures be called by the current user?
    * @returns `TRUE` if the user is allowed to call all procedures returned by getProcedures otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def allProceduresAreCallable(): scala.Boolean
  /**
    * Can all the tables returned by getTable be SELECTed by the current user?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def allTablesAreSelectable(): scala.Boolean
  /**
    * does a data definition statement within a transaction force the transaction to commit?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionCausesTransactionCommit(): scala.Boolean
  /**
    * is a data definition statement within a transaction ignored?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionIgnoredInTransactions(): scala.Boolean
  /**
    * indicates whether or not a visible row delete can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowDeleted()} . If {@link
    * deletesAreDetected()} returns `FALSE` , then deleted rows are removed from the result set.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def deletesAreDetected(setType: scala.Double): scala.Boolean
  /**
    * Did {@link getMaxRowSize()} include LONGVARCHAR and LONGVARBINARY blobs?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def doesMaxRowSizeIncludeBlobs(): scala.Boolean
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
  def getBestRowIdentifier(
    catalog: js.Any,
    schema: java.lang.String,
    table: java.lang.String,
    scope: scala.Double,
    nullable: scala.Boolean
  ): XResultSet
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogSeparator(): java.lang.String
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogTerm(): java.lang.String
  /**
    * gets the catalog names available in this database. The results are ordered by catalog name.
    *
    * The catalog column is:
    *
    *  1. **TABLE_CAT** string => catalog name
    * @returns each row has a single String column that is a catalog name
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogs(): XResultSet
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
  def getColumnPrivileges(
    catalog: js.Any,
    schema: java.lang.String,
    table: java.lang.String,
    columnNamePattern: java.lang.String
  ): XResultSet
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
  def getColumns(
    catalog: js.Any,
    schemaPattern: java.lang.String,
    tableNamePattern: java.lang.String,
    columnNamePattern: java.lang.String
  ): XResultSet
  /**
    * retrieves the connection that produced this metadata object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(): XConnection
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
    primarySchema: java.lang.String,
    primaryTable: java.lang.String,
    foreignCatalog: js.Any,
    foreignSchema: java.lang.String,
    foreignTable: java.lang.String
  ): XResultSet
  /** returns the name of the database product. */
  def getDatabaseProductName(): java.lang.String
  /** returns the version of the database product. */
  def getDatabaseProductVersion(): java.lang.String
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  def getDefaultTransactionIsolation(): scala.Double
  /** returns the SDBC driver major version number. */
  def getDriverMajorVersion(): scala.Double
  /** returns the SDBC driver minor version number. */
  def getDriverMinorVersion(): scala.Double
  /** returns the name of the SDBC driver. */
  def getDriverName(): java.lang.String
  /** returns the version number of the SDBC driver. */
  def getDriverVersion(): java.lang.String
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
  def getExportedKeys(catalog: js.Any, schema: java.lang.String, table: java.lang.String): XResultSet
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getExtraNameCharacters(): java.lang.String
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getIdentifierQuoteString(): java.lang.String
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
  def getImportedKeys(catalog: js.Any, schema: java.lang.String, table: java.lang.String): XResultSet
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
  def getIndexInfo(
    catalog: js.Any,
    schema: java.lang.String,
    table: java.lang.String,
    unique: scala.Boolean,
    approximate: scala.Boolean
  ): XResultSet
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxBinaryLiteralLength(): scala.Double
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCatalogNameLength(): scala.Double
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCharLiteralLength(): scala.Double
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnNameLength(): scala.Double
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInGroupBy(): scala.Double
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInIndex(): scala.Double
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInOrderBy(): scala.Double
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInSelect(): scala.Double
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInTable(): scala.Double
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxConnections(): scala.Double
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCursorNameLength(): scala.Double
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxIndexLength(): scala.Double
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxProcedureNameLength(): scala.Double
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxRowSize(): scala.Double
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxSchemaNameLength(): scala.Double
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatementLength(): scala.Double
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatements(): scala.Double
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTableNameLength(): scala.Double
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTablesInSelect(): scala.Double
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxUserNameLength(): scala.Double
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getNumericFunctions(): java.lang.String
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
  def getPrimaryKeys(catalog: js.Any, schema: java.lang.String, table: java.lang.String): XResultSet
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
  def getProcedureColumns(
    catalog: js.Any,
    schemaPattern: java.lang.String,
    procedureNamePattern: java.lang.String,
    columnNamePattern: java.lang.String
  ): XResultSet
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getProcedureTerm(): java.lang.String
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
  def getProcedures(catalog: js.Any, schemaPattern: java.lang.String, procedureNamePattern: java.lang.String): XResultSet
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSQLKeywords(): java.lang.String
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSchemaTerm(): java.lang.String
  /**
    * Gets the schema names available in this database. The results are ordered by schema name.
    *
    * The schema column is:
    *
    *  1. **TABLE_SCHEM** string => schema name
    * @returns each row has a single String column that is a schema name
    * @throws SQLException if a database access error occurs.
    */
  def getSchemas(): XResultSet
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
  def getSearchStringEscape(): java.lang.String
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getStringFunctions(): java.lang.String
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSystemFunctions(): java.lang.String
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
  def getTablePrivileges(catalog: js.Any, schemaPattern: java.lang.String, tableNamePattern: java.lang.String): XResultSet
  /**
    * gets the table types available in this database. The results are ordered by table type.
    *
    * The table type is:
    *
    *  1. **TABLE_TYPE** string => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
    * @returns each row has a single String column that is a table type
    * @throws SQLException if a database access error occurs.
    */
  def getTableTypes(): XResultSet
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
  def getTables(
    catalog: js.Any,
    schemaPattern: java.lang.String,
    tableNamePattern: java.lang.String,
    types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): XResultSet
  /**
    * gets a comma-separated list of time and date functions.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getTimeDateFunctions(): java.lang.String
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
  def getTypeInfo(): XResultSet
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
  def getUDTs(
    catalog: js.Any,
    schemaPattern: java.lang.String,
    typeNamePattern: java.lang.String,
    types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): XResultSet
  /** returns the URL for the database connection */
  def getURL(): java.lang.String
  /** returns the user name from this database connection. */
  def getUserName(): java.lang.String
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
  def getVersionColumns(catalog: js.Any, schema: java.lang.String, table: java.lang.String): XResultSet
  /**
    * indicates whether or not a visible row insert can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowInserted()} .()
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def insertsAreDetected(setType: scala.Double): scala.Boolean
  /**
    * Does a catalog appear at the start of a qualified table name? (Otherwise it appears at the end)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCatalogAtStart(): scala.Boolean
  /**
    * checks if the database in read-only mode.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(): scala.Boolean
  /**
    * are concatenations between NULL and non-NULL values NULL?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullPlusNonNullIsNull(): scala.Boolean
  /**
    * Are NULL values sorted at the end, regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtEnd(): scala.Boolean
  /**
    * Are NULL values sorted at the start regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtStart(): scala.Boolean
  /**
    * Are NULL values sorted high?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedHigh(): scala.Boolean
  /**
    * Are NULL values sorted low?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedLow(): scala.Boolean
  /**
    * indicates whether deletes made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersDeletesAreVisible(setType: scala.Double): scala.Boolean
  /**
    * indicates whether inserts made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersInsertsAreVisible(setType: scala.Double): scala.Boolean
  /**
    * indicates whether updates made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersUpdatesAreVisible(setType: scala.Double): scala.Boolean
  /**
    * indicates whether a result set's own deletes are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownDeletesAreVisible(setType: scala.Double): scala.Boolean
  /**
    * indicates whether a result set's own inserts are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownInsertsAreVisible(setType: scala.Double): scala.Boolean
  /**
    * indicates whether a result set's own updates are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownUpdatesAreVisible(setType: scala.Double): scala.Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseQuotedIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseQuotedIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseQuotedIdentifiers(): scala.Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 entry level SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92EntryLevelSQL(): scala.Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 full SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92FullSQL(): scala.Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 intermediate SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92IntermediateSQL(): scala.Boolean
  /**
    * support the Database "ALTER TABLE" with add column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithAddColumn(): scala.Boolean
  /**
    * support the Database "ALTER TABLE" with drop column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithDropColumn(): scala.Boolean
  /**
    * indicates whether the driver supports batch updates.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsBatchUpdates(): scala.Boolean
  /**
    * Can a catalog name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInDataManipulation(): scala.Boolean
  /**
    * Can a catalog name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInIndexDefinitions(): scala.Boolean
  /**
    * Can a catalog name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInPrivilegeDefinitions(): scala.Boolean
  /**
    * Can a catalog name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInProcedureCalls(): scala.Boolean
  /**
    * Can a catalog name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInTableDefinitions(): scala.Boolean
  /**
    * support the Database column aliasing?
    *
    * The SQL AS clause can be used to provide names for computed columns or to provide alias names for columns as required.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsColumnAliasing(): scala.Boolean
  /**
    * `TRUE` , if the Database supports the CONVERT between the given SQL types otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsConvert(fromType: scala.Double, toType: scala.Double): scala.Boolean
  /**
    * `TRUE` , if the database supports ODBC Core SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCoreSQLGrammar(): scala.Boolean
  /**
    * Are correlated subqueries supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCorrelatedSubqueries(): scala.Boolean
  /**
    * support the Database both data definition and data manipulation statements within a transaction?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataDefinitionAndDataManipulationTransactions(): scala.Boolean
  /**
    * are only data manipulation statements within a transaction supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataManipulationTransactionsOnly(): scala.Boolean
  /**
    * If table correlation names are supported, are they restricted to be different from the names of the tables?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDifferentTableCorrelationNames(): scala.Boolean
  /**
    * Are expressions in "ORDER BY" lists supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExpressionsInOrderBy(): scala.Boolean
  /**
    * `TRUE` , if the database supports ODBC Extended SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExtendedSQLGrammar(): scala.Boolean
  /**
    * @returns `TRUE` , if full nested outer joins are supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsFullOuterJoins(): scala.Boolean
  /**
    * Is some form of "GROUP BY" clause supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupBy(): scala.Boolean
  /**
    * Can a "GROUP BY" clause add columns not in the SELECT provided it specifies all the columns in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByBeyondSelect(): scala.Boolean
  /**
    * Can a "GROUP BY" clause use columns not in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByUnrelated(): scala.Boolean
  /**
    * returns `TRUE` , if the Database supports SQL Integrity Enhancement Facility, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsIntegrityEnhancementFacility(): scala.Boolean
  /**
    * Is the escape character in "LIKE" clauses supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsLikeEscapeClause(): scala.Boolean
  /**
    * @returns `TRUE` , if there is limited support for outer joins. (This will be `TRUE` if supportFullOuterJoins is `TRUE` .) `FALSE` is returned otherwise.
    * @throws SQLException if a database access error occurs.
    */
  def supportsLimitedOuterJoins(): scala.Boolean
  /**
    * `TRUE` , if the database supports ODBC Minimum SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMinimumSQLGrammar(): scala.Boolean
  /**
    * use the database "mixed case unquoted SQL identifiers" case sensitive.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseIdentifiers(): scala.Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case sensitive and as a result store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseQuotedIdentifiers(): scala.Boolean
  /**
    * Are multiple XResultSets from a single execute supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleResultSets(): scala.Boolean
  /**
    * Can we have multiple transactions open at once (on different connections)?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleTransactions(): scala.Boolean
  /**
    * Can columns be defined as non-nullable?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsNonNullableColumns(): scala.Boolean
  /**
    * Can cursors remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossCommit(): scala.Boolean
  /**
    * Can cursors remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossRollback(): scala.Boolean
  /**
    * Can statements remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossCommit(): scala.Boolean
  /**
    * Can statements remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossRollback(): scala.Boolean
  /**
    * Can an "ORDER BY" clause use columns not in the SELECT statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOrderByUnrelated(): scala.Boolean
  /**
    * @returns `TRUE` , if some form of outer join is supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsOuterJoins(): scala.Boolean
  /**
    * Is positioned DELETE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedDelete(): scala.Boolean
  /**
    * Is positioned UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedUpdate(): scala.Boolean
  /**
    * Does the database support the concurrency type in combination with the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @param concurrency defined in {@link com.sun.star.sdbc.ResultSetConcurrency}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetConcurrency(setType: scala.Double, concurrency: scala.Double): scala.Boolean
  /**
    * Does the database support the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetType(setType: scala.Double): scala.Boolean
  /**
    * Can a schema name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInDataManipulation(): scala.Boolean
  /**
    * Can a schema name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInIndexDefinitions(): scala.Boolean
  /**
    * Can a schema name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInPrivilegeDefinitions(): scala.Boolean
  /**
    * Can a schema name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInProcedureCalls(): scala.Boolean
  /**
    * Can a schema name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInTableDefinitions(): scala.Boolean
  /**
    * Is SELECT for UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSelectForUpdate(): scala.Boolean
  /**
    * Are stored procedure calls using the stored procedure escape syntax supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsStoredProcedures(): scala.Boolean
  /**
    * Are subqueries in comparison expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInComparisons(): scala.Boolean
  /**
    * Are subqueries in "exists" expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInExists(): scala.Boolean
  /**
    * Are subqueries in "in" statements supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInIns(): scala.Boolean
  /**
    * Are subqueries in quantified expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInQuantifieds(): scala.Boolean
  /**
    * Are table correlation names supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTableCorrelationNames(): scala.Boolean
  /**
    * Does this database support the given transaction isolation level?
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.Connection
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactionIsolationLevel(level: scala.Double): scala.Boolean
  /**
    * support the Database transactions? If not, invoking the method {@link com.sun.star.sdbc.XConnection.commit()} is a noop and the isolation level is
    * TransactionIsolation_NONE.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactions(): scala.Boolean
  /**
    * `TRUE` , if the Database supports the CONVERT function between SQL types, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTypeConversion(): scala.Boolean
  /**
    * Is SQL UNION supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnion(): scala.Boolean
  /**
    * Is SQL UNION ALL supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnionAll(): scala.Boolean
  /**
    * indicates whether or not a visible row update can be detected by calling the method `XResultSet.rowUpdated` .
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def updatesAreDetected(setType: scala.Double): scala.Boolean
  /**
    * use the database one local file to save for each table.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFilePerTable(): scala.Boolean
  /**
    * use the database local files to save the tables.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFiles(): scala.Boolean
}

object XDatabaseMetaData {
  @scala.inline
  def apply(
    CatalogSeparator: java.lang.String,
    CatalogTerm: java.lang.String,
    Catalogs: XResultSet,
    Connection: XConnection,
    DatabaseProductName: java.lang.String,
    DatabaseProductVersion: java.lang.String,
    DefaultTransactionIsolation: scala.Double,
    DriverMajorVersion: scala.Double,
    DriverMinorVersion: scala.Double,
    DriverName: java.lang.String,
    DriverVersion: java.lang.String,
    ExtraNameCharacters: java.lang.String,
    IdentifierQuoteString: java.lang.String,
    MaxBinaryLiteralLength: scala.Double,
    MaxCatalogNameLength: scala.Double,
    MaxCharLiteralLength: scala.Double,
    MaxColumnNameLength: scala.Double,
    MaxColumnsInGroupBy: scala.Double,
    MaxColumnsInIndex: scala.Double,
    MaxColumnsInOrderBy: scala.Double,
    MaxColumnsInSelect: scala.Double,
    MaxColumnsInTable: scala.Double,
    MaxConnections: scala.Double,
    MaxCursorNameLength: scala.Double,
    MaxIndexLength: scala.Double,
    MaxProcedureNameLength: scala.Double,
    MaxRowSize: scala.Double,
    MaxSchemaNameLength: scala.Double,
    MaxStatementLength: scala.Double,
    MaxStatements: scala.Double,
    MaxTableNameLength: scala.Double,
    MaxTablesInSelect: scala.Double,
    MaxUserNameLength: scala.Double,
    NumericFunctions: java.lang.String,
    ProcedureTerm: java.lang.String,
    SQLKeywords: java.lang.String,
    SchemaTerm: java.lang.String,
    Schemas: XResultSet,
    SearchStringEscape: java.lang.String,
    StringFunctions: java.lang.String,
    SystemFunctions: java.lang.String,
    TableTypes: XResultSet,
    TimeDateFunctions: java.lang.String,
    TypeInfo: XResultSet,
    URL: java.lang.String,
    UserName: java.lang.String,
    XInterface: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = null,
    allProceduresAreCallable: js.Function0[scala.Boolean],
    allTablesAreSelectable: js.Function0[scala.Boolean],
    dataDefinitionCausesTransactionCommit: js.Function0[scala.Boolean],
    dataDefinitionIgnoredInTransactions: js.Function0[scala.Boolean],
    deletesAreDetected: js.Function1[scala.Double, scala.Boolean],
    doesMaxRowSizeIncludeBlobs: js.Function0[scala.Boolean],
    getBestRowIdentifier: js.Function5[js.Any, java.lang.String, java.lang.String, scala.Double, scala.Boolean, XResultSet],
    getCatalogSeparator: js.Function0[java.lang.String],
    getCatalogTerm: js.Function0[java.lang.String],
    getCatalogs: js.Function0[XResultSet],
    getColumnPrivileges: js.Function4[js.Any, java.lang.String, java.lang.String, java.lang.String, XResultSet],
    getColumns: js.Function4[js.Any, java.lang.String, java.lang.String, java.lang.String, XResultSet],
    getConnection: js.Function0[XConnection],
    getCrossReference: js.Function6[
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      XResultSet
    ],
    getDatabaseProductName: js.Function0[java.lang.String],
    getDatabaseProductVersion: js.Function0[java.lang.String],
    getDefaultTransactionIsolation: js.Function0[scala.Double],
    getDriverMajorVersion: js.Function0[scala.Double],
    getDriverMinorVersion: js.Function0[scala.Double],
    getDriverName: js.Function0[java.lang.String],
    getDriverVersion: js.Function0[java.lang.String],
    getExportedKeys: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    getExtraNameCharacters: js.Function0[java.lang.String],
    getIdentifierQuoteString: js.Function0[java.lang.String],
    getImportedKeys: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    getIndexInfo: js.Function5[js.Any, java.lang.String, java.lang.String, scala.Boolean, scala.Boolean, XResultSet],
    getMaxBinaryLiteralLength: js.Function0[scala.Double],
    getMaxCatalogNameLength: js.Function0[scala.Double],
    getMaxCharLiteralLength: js.Function0[scala.Double],
    getMaxColumnNameLength: js.Function0[scala.Double],
    getMaxColumnsInGroupBy: js.Function0[scala.Double],
    getMaxColumnsInIndex: js.Function0[scala.Double],
    getMaxColumnsInOrderBy: js.Function0[scala.Double],
    getMaxColumnsInSelect: js.Function0[scala.Double],
    getMaxColumnsInTable: js.Function0[scala.Double],
    getMaxConnections: js.Function0[scala.Double],
    getMaxCursorNameLength: js.Function0[scala.Double],
    getMaxIndexLength: js.Function0[scala.Double],
    getMaxProcedureNameLength: js.Function0[scala.Double],
    getMaxRowSize: js.Function0[scala.Double],
    getMaxSchemaNameLength: js.Function0[scala.Double],
    getMaxStatementLength: js.Function0[scala.Double],
    getMaxStatements: js.Function0[scala.Double],
    getMaxTableNameLength: js.Function0[scala.Double],
    getMaxTablesInSelect: js.Function0[scala.Double],
    getMaxUserNameLength: js.Function0[scala.Double],
    getNumericFunctions: js.Function0[java.lang.String],
    getPrimaryKeys: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    getProcedureColumns: js.Function4[js.Any, java.lang.String, java.lang.String, java.lang.String, XResultSet],
    getProcedureTerm: js.Function0[java.lang.String],
    getProcedures: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    getSQLKeywords: js.Function0[java.lang.String],
    getSchemaTerm: js.Function0[java.lang.String],
    getSchemas: js.Function0[XResultSet],
    getSearchStringEscape: js.Function0[java.lang.String],
    getStringFunctions: js.Function0[java.lang.String],
    getSystemFunctions: js.Function0[java.lang.String],
    getTablePrivileges: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    getTableTypes: js.Function0[XResultSet],
    getTables: js.Function4[
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XResultSet
    ],
    getTimeDateFunctions: js.Function0[java.lang.String],
    getTypeInfo: js.Function0[XResultSet],
    getUDTs: js.Function4[
      js.Any, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      XResultSet
    ],
    getURL: js.Function0[java.lang.String],
    getUserName: js.Function0[java.lang.String],
    getVersionColumns: js.Function3[js.Any, java.lang.String, java.lang.String, XResultSet],
    insertsAreDetected: js.Function1[scala.Double, scala.Boolean],
    isCatalogAtStart: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    nullPlusNonNullIsNull: js.Function0[scala.Boolean],
    nullsAreSortedAtEnd: js.Function0[scala.Boolean],
    nullsAreSortedAtStart: js.Function0[scala.Boolean],
    nullsAreSortedHigh: js.Function0[scala.Boolean],
    nullsAreSortedLow: js.Function0[scala.Boolean],
    othersDeletesAreVisible: js.Function1[scala.Double, scala.Boolean],
    othersInsertsAreVisible: js.Function1[scala.Double, scala.Boolean],
    othersUpdatesAreVisible: js.Function1[scala.Double, scala.Boolean],
    ownDeletesAreVisible: js.Function1[scala.Double, scala.Boolean],
    ownInsertsAreVisible: js.Function1[scala.Double, scala.Boolean],
    ownUpdatesAreVisible: js.Function1[scala.Double, scala.Boolean],
    storesLowerCaseIdentifiers: js.Function0[scala.Boolean],
    storesLowerCaseQuotedIdentifiers: js.Function0[scala.Boolean],
    storesMixedCaseIdentifiers: js.Function0[scala.Boolean],
    storesMixedCaseQuotedIdentifiers: js.Function0[scala.Boolean],
    storesUpperCaseIdentifiers: js.Function0[scala.Boolean],
    storesUpperCaseQuotedIdentifiers: js.Function0[scala.Boolean],
    supportsANSI92EntryLevelSQL: js.Function0[scala.Boolean],
    supportsANSI92FullSQL: js.Function0[scala.Boolean],
    supportsANSI92IntermediateSQL: js.Function0[scala.Boolean],
    supportsAlterTableWithAddColumn: js.Function0[scala.Boolean],
    supportsAlterTableWithDropColumn: js.Function0[scala.Boolean],
    supportsBatchUpdates: js.Function0[scala.Boolean],
    supportsCatalogsInDataManipulation: js.Function0[scala.Boolean],
    supportsCatalogsInIndexDefinitions: js.Function0[scala.Boolean],
    supportsCatalogsInPrivilegeDefinitions: js.Function0[scala.Boolean],
    supportsCatalogsInProcedureCalls: js.Function0[scala.Boolean],
    supportsCatalogsInTableDefinitions: js.Function0[scala.Boolean],
    supportsColumnAliasing: js.Function0[scala.Boolean],
    supportsConvert: js.Function2[scala.Double, scala.Double, scala.Boolean],
    supportsCoreSQLGrammar: js.Function0[scala.Boolean],
    supportsCorrelatedSubqueries: js.Function0[scala.Boolean],
    supportsDataDefinitionAndDataManipulationTransactions: js.Function0[scala.Boolean],
    supportsDataManipulationTransactionsOnly: js.Function0[scala.Boolean]
  ): XDatabaseMetaData = {
    val __obj = js.Dynamic.literal(CatalogSeparator = CatalogSeparator, CatalogTerm = CatalogTerm, Catalogs = Catalogs, Connection = Connection, DatabaseProductName = DatabaseProductName, DatabaseProductVersion = DatabaseProductVersion, DefaultTransactionIsolation = DefaultTransactionIsolation, DriverMajorVersion = DriverMajorVersion, DriverMinorVersion = DriverMinorVersion, DriverName = DriverName, DriverVersion = DriverVersion, ExtraNameCharacters = ExtraNameCharacters, IdentifierQuoteString = IdentifierQuoteString, MaxBinaryLiteralLength = MaxBinaryLiteralLength, MaxCatalogNameLength = MaxCatalogNameLength, MaxCharLiteralLength = MaxCharLiteralLength, MaxColumnNameLength = MaxColumnNameLength, MaxColumnsInGroupBy = MaxColumnsInGroupBy, MaxColumnsInIndex = MaxColumnsInIndex, MaxColumnsInOrderBy = MaxColumnsInOrderBy, MaxColumnsInSelect = MaxColumnsInSelect, MaxColumnsInTable = MaxColumnsInTable, MaxConnections = MaxConnections, MaxCursorNameLength = MaxCursorNameLength, MaxIndexLength = MaxIndexLength, MaxProcedureNameLength = MaxProcedureNameLength, MaxRowSize = MaxRowSize, MaxSchemaNameLength = MaxSchemaNameLength, MaxStatementLength = MaxStatementLength, MaxStatements = MaxStatements, MaxTableNameLength = MaxTableNameLength, MaxTablesInSelect = MaxTablesInSelect, MaxUserNameLength = MaxUserNameLength, NumericFunctions = NumericFunctions, ProcedureTerm = ProcedureTerm, SQLKeywords = SQLKeywords, SchemaTerm = SchemaTerm, Schemas = Schemas, SearchStringEscape = SearchStringEscape, StringFunctions = StringFunctions, SystemFunctions = SystemFunctions, TableTypes = TableTypes, TimeDateFunctions = TimeDateFunctions, TypeInfo = TypeInfo, URL = URL, UserName = UserName, allProceduresAreCallable = allProceduresAreCallable, allTablesAreSelectable = allTablesAreSelectable, dataDefinitionCausesTransactionCommit = dataDefinitionCausesTransactionCommit, dataDefinitionIgnoredInTransactions = dataDefinitionIgnoredInTransactions, deletesAreDetected = deletesAreDetected, doesMaxRowSizeIncludeBlobs = doesMaxRowSizeIncludeBlobs, getBestRowIdentifier = getBestRowIdentifier, getCatalogSeparator = getCatalogSeparator, getCatalogTerm = getCatalogTerm, getCatalogs = getCatalogs, getColumnPrivileges = getColumnPrivileges, getColumns = getColumns, getConnection = getConnection, getCrossReference = getCrossReference, getDatabaseProductName = getDatabaseProductName, getDatabaseProductVersion = getDatabaseProductVersion, getDefaultTransactionIsolation = getDefaultTransactionIsolation, getDriverMajorVersion = getDriverMajorVersion, getDriverMinorVersion = getDriverMinorVersion, getDriverName = getDriverName, getDriverVersion = getDriverVersion, getExportedKeys = getExportedKeys, getExtraNameCharacters = getExtraNameCharacters, getIdentifierQuoteString = getIdentifierQuoteString, getImportedKeys = getImportedKeys, getIndexInfo = getIndexInfo, getMaxBinaryLiteralLength = getMaxBinaryLiteralLength, getMaxCatalogNameLength = getMaxCatalogNameLength, getMaxCharLiteralLength = getMaxCharLiteralLength, getMaxColumnNameLength = getMaxColumnNameLength, getMaxColumnsInGroupBy = getMaxColumnsInGroupBy, getMaxColumnsInIndex = getMaxColumnsInIndex, getMaxColumnsInOrderBy = getMaxColumnsInOrderBy, getMaxColumnsInSelect = getMaxColumnsInSelect, getMaxColumnsInTable = getMaxColumnsInTable, getMaxConnections = getMaxConnections, getMaxCursorNameLength = getMaxCursorNameLength, getMaxIndexLength = getMaxIndexLength, getMaxProcedureNameLength = getMaxProcedureNameLength, getMaxRowSize = getMaxRowSize, getMaxSchemaNameLength = getMaxSchemaNameLength, getMaxStatementLength = getMaxStatementLength, getMaxStatements = getMaxStatements, getMaxTableNameLength = getMaxTableNameLength, getMaxTablesInSelect = getMaxTablesInSelect, getMaxUserNameLength = getMaxUserNameLength, getNumericFunctions = getNumericFunctions, getPrimaryKeys = getPrimaryKeys, getProcedureColumns = getProcedureColumns, getProcedureTerm = getProcedureTerm, getProcedures = getProcedures, getSQLKeywords = getSQLKeywords, getSchemaTerm = getSchemaTerm, getSchemas = getSchemas, getSearchStringEscape = getSearchStringEscape, getStringFunctions = getStringFunctions, getSystemFunctions = getSystemFunctions, getTablePrivileges = getTablePrivileges, getTableTypes = getTableTypes, getTables = getTables, getTimeDateFunctions = getTimeDateFunctions, getTypeInfo = getTypeInfo, getUDTs = getUDTs, getURL = getURL, getUserName = getUserName, getVersionColumns = getVersionColumns, insertsAreDetected = insertsAreDetected, isCatalogAtStart = isCatalogAtStart, isReadOnly = isReadOnly, nullPlusNonNullIsNull = nullPlusNonNullIsNull, nullsAreSortedAtEnd = nullsAreSortedAtEnd, nullsAreSortedAtStart = nullsAreSortedAtStart, nullsAreSortedHigh = nullsAreSortedHigh, nullsAreSortedLow = nullsAreSortedLow, othersDeletesAreVisible = othersDeletesAreVisible, othersInsertsAreVisible = othersInsertsAreVisible, othersUpdatesAreVisible = othersUpdatesAreVisible, ownDeletesAreVisible = ownDeletesAreVisible, ownInsertsAreVisible = ownInsertsAreVisible, ownUpdatesAreVisible = ownUpdatesAreVisible, storesLowerCaseIdentifiers = storesLowerCaseIdentifiers, storesLowerCaseQuotedIdentifiers = storesLowerCaseQuotedIdentifiers, storesMixedCaseIdentifiers = storesMixedCaseIdentifiers, storesMixedCaseQuotedIdentifiers = storesMixedCaseQuotedIdentifiers, storesUpperCaseIdentifiers = storesUpperCaseIdentifiers, storesUpperCaseQuotedIdentifiers = storesUpperCaseQuotedIdentifiers, supportsANSI92EntryLevelSQL = supportsANSI92EntryLevelSQL, supportsANSI92FullSQL = supportsANSI92FullSQL, supportsANSI92IntermediateSQL = supportsANSI92IntermediateSQL, supportsAlterTableWithAddColumn = supportsAlterTableWithAddColumn, supportsAlterTableWithDropColumn = supportsAlterTableWithDropColumn, supportsBatchUpdates = supportsBatchUpdates, supportsCatalogsInDataManipulation = supportsCatalogsInDataManipulation, supportsCatalogsInIndexDefinitions = supportsCatalogsInIndexDefinitions, supportsCatalogsInPrivilegeDefinitions = supportsCatalogsInPrivilegeDefinitions, supportsCatalogsInProcedureCalls = supportsCatalogsInProcedureCalls, supportsCatalogsInTableDefinitions = supportsCatalogsInTableDefinitions, supportsColumnAliasing = supportsColumnAliasing, supportsConvert = supportsConvert, supportsCoreSQLGrammar = supportsCoreSQLGrammar, supportsCorrelatedSubqueries = supportsCorrelatedSubqueries, supportsDataDefinitionAndDataManipulationTransactions = supportsDataDefinitionAndDataManipulationTransactions, supportsDataManipulationTransactionsOnly = supportsDataManipulationTransactionsOnly)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XInterface)
    __obj.asInstanceOf[XDatabaseMetaData]
  }
}

