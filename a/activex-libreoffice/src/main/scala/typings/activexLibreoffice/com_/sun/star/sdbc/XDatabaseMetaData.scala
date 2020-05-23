package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
trait XDatabaseMetaData extends XInterface {
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogSeparator: String
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val CatalogTerm: String
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
  val DatabaseProductName: String
  /** returns the version of the database product. */
  val DatabaseProductVersion: String
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  val DefaultTransactionIsolation: Double
  /** returns the SDBC driver major version number. */
  val DriverMajorVersion: Double
  /** returns the SDBC driver minor version number. */
  val DriverMinorVersion: Double
  /** returns the name of the SDBC driver. */
  val DriverName: String
  /** returns the version number of the SDBC driver. */
  val DriverVersion: String
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ExtraNameCharacters: String
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val IdentifierQuoteString: String
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxBinaryLiteralLength: Double
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCatalogNameLength: Double
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCharLiteralLength: Double
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnNameLength: Double
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInGroupBy: Double
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInIndex: Double
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInOrderBy: Double
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInSelect: Double
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxColumnsInTable: Double
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxConnections: Double
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxCursorNameLength: Double
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxIndexLength: Double
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxProcedureNameLength: Double
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxRowSize: Double
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxSchemaNameLength: Double
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatementLength: Double
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxStatements: Double
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTableNameLength: Double
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxTablesInSelect: Double
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val MaxUserNameLength: Double
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val NumericFunctions: String
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val ProcedureTerm: String
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SQLKeywords: String
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SchemaTerm: String
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
  val SearchStringEscape: String
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val StringFunctions: String
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  val SystemFunctions: String
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
  val TimeDateFunctions: String
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
  val URL: String
  /** returns the user name from this database connection. */
  val UserName: String
  /**
    * Can all the procedures returned by getProcedures be called by the current user?
    * @returns `TRUE` if the user is allowed to call all procedures returned by getProcedures otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def allProceduresAreCallable(): Boolean
  /**
    * Can all the tables returned by getTable be SELECTed by the current user?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def allTablesAreSelectable(): Boolean
  /**
    * does a data definition statement within a transaction force the transaction to commit?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionCausesTransactionCommit(): Boolean
  /**
    * is a data definition statement within a transaction ignored?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def dataDefinitionIgnoredInTransactions(): Boolean
  /**
    * indicates whether or not a visible row delete can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowDeleted()} . If {@link
    * deletesAreDetected()} returns `FALSE` , then deleted rows are removed from the result set.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def deletesAreDetected(setType: Double): Boolean
  /**
    * Did {@link getMaxRowSize()} include LONGVARCHAR and LONGVARBINARY blobs?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def doesMaxRowSizeIncludeBlobs(): Boolean
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
  def getBestRowIdentifier(catalog: js.Any, schema: String, table: String, scope: Double, nullable: Boolean): XResultSet
  /**
    * return the separator between catalog and table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogSeparator(): String
  /**
    * return the database vendor's preferred term for "catalog"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getCatalogTerm(): String
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
  def getColumnPrivileges(catalog: js.Any, schema: String, table: String, columnNamePattern: String): XResultSet
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
  def getColumns(catalog: js.Any, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): XResultSet
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
    primarySchema: String,
    primaryTable: String,
    foreignCatalog: js.Any,
    foreignSchema: String,
    foreignTable: String
  ): XResultSet
  /** returns the name of the database product. */
  def getDatabaseProductName(): String
  /** returns the version of the database product. */
  def getDatabaseProductVersion(): String
  /**
    * return the database default transaction isolation level. The values are defined in {@link com.sun.star.sdbc.TransactionIsolation} .
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.XConnection
    * @throws SQLException if a database access error occurs.
    */
  def getDefaultTransactionIsolation(): Double
  /** returns the SDBC driver major version number. */
  def getDriverMajorVersion(): Double
  /** returns the SDBC driver minor version number. */
  def getDriverMinorVersion(): Double
  /** returns the name of the SDBC driver. */
  def getDriverName(): String
  /** returns the version number of the SDBC driver. */
  def getDriverVersion(): String
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
  def getExportedKeys(catalog: js.Any, schema: String, table: String): XResultSet
  /**
    * gets all the "extra" characters that can be used in unquoted identifier names (those beyond a-z, A-Z, 0-9 and _).
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getExtraNameCharacters(): String
  /**
    * What's the string used to quote SQL identifiers? This returns a space " " if identifier quoting is not supported.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getIdentifierQuoteString(): String
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
  def getImportedKeys(catalog: js.Any, schema: String, table: String): XResultSet
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
  def getIndexInfo(catalog: js.Any, schema: String, table: String, unique: Boolean, approximate: Boolean): XResultSet
  /**
    * return the maximal number of hex characters in an inline binary literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxBinaryLiteralLength(): Double
  /**
    * return the maximum length of a catalog name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCatalogNameLength(): Double
  /**
    * return the max length for a character literal
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCharLiteralLength(): Double
  /**
    * return the limit on column name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnNameLength(): Double
  /**
    * return the maximum number of columns in a "GROUP BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInGroupBy(): Double
  /**
    * return the maximum number of columns allowed in an index
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInIndex(): Double
  /**
    * return the maximum number of columns in an "ORDER BY" clause
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInOrderBy(): Double
  /**
    * return the maximum number of columns in a "SELECT" list
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInSelect(): Double
  /**
    * return the maximum number of columns in a table
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxColumnsInTable(): Double
  /**
    * return the number of active connections at a time to this database.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxConnections(): Double
  /**
    * return the maximum cursor name length
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxCursorNameLength(): Double
  /**
    * return the maximum length of an index (in bytes)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxIndexLength(): Double
  /**
    * return the maximum length of a procedure name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxProcedureNameLength(): Double
  /**
    * return the maximum length of a single row.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxRowSize(): Double
  /**
    * return the maximum length allowed for a schema name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxSchemaNameLength(): Double
  /**
    * return the maximum length of a SQL statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatementLength(): Double
  /**
    * return the maximal number of open active statements at one time to this database
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxStatements(): Double
  /**
    * return the maximum length of a table name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTableNameLength(): Double
  /**
    * return the maximum number of tables in a SELECT statement
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxTablesInSelect(): Double
  /**
    * return the maximum length of a user name
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getMaxUserNameLength(): Double
  /**
    * gets a comma-separated list of math functions. These are the X/Open CLI math function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getNumericFunctions(): String
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
  def getPrimaryKeys(catalog: js.Any, schema: String, table: String): XResultSet
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
  def getProcedureColumns(catalog: js.Any, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): XResultSet
  /**
    * return the database vendor's preferred term for "procedure"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getProcedureTerm(): String
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
  def getProcedures(catalog: js.Any, schemaPattern: String, procedureNamePattern: String): XResultSet
  /**
    * gets a comma-separated list of all a database's SQL keywords that are NOT also SQL92 keywords.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSQLKeywords(): String
  /**
    * return the database vendor's preferred term for "schema"
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSchemaTerm(): String
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
  def getSearchStringEscape(): String
  /**
    * gets a comma-separated list of string functions. These are the X/Open CLI string function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getStringFunctions(): String
  /**
    * gets a comma-separated list of system functions. These are the X/Open CLI system function names used in the SDBC function escape clause.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getSystemFunctions(): String
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
  def getTablePrivileges(catalog: js.Any, schemaPattern: String, tableNamePattern: String): XResultSet
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
  def getTables(catalog: js.Any, schemaPattern: String, tableNamePattern: String, types: SeqEquiv[String]): XResultSet
  /**
    * gets a comma-separated list of time and date functions.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def getTimeDateFunctions(): String
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
  def getUDTs(catalog: js.Any, schemaPattern: String, typeNamePattern: String, types: SeqEquiv[Double]): XResultSet
  /** returns the URL for the database connection */
  def getURL(): String
  /** returns the user name from this database connection. */
  def getUserName(): String
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
  def getVersionColumns(catalog: js.Any, schema: String, table: String): XResultSet
  /**
    * indicates whether or not a visible row insert can be detected by calling {@link com.sun.star.sdbc.XResultSet.rowInserted()} .()
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def insertsAreDetected(setType: Double): Boolean
  /**
    * Does a catalog appear at the start of a qualified table name? (Otherwise it appears at the end)
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isCatalogAtStart(): Boolean
  /**
    * checks if the database in read-only mode.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(): Boolean
  /**
    * are concatenations between NULL and non-NULL values NULL?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullPlusNonNullIsNull(): Boolean
  /**
    * Are NULL values sorted at the end, regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtEnd(): Boolean
  /**
    * Are NULL values sorted at the start regardless of sort order?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedAtStart(): Boolean
  /**
    * Are NULL values sorted high?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedHigh(): Boolean
  /**
    * Are NULL values sorted low?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def nullsAreSortedLow(): Boolean
  /**
    * indicates whether deletes made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersDeletesAreVisible(setType: Double): Boolean
  /**
    * indicates whether inserts made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersInsertsAreVisible(setType: Double): Boolean
  /**
    * indicates whether updates made by others are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def othersUpdatesAreVisible(setType: Double): Boolean
  /**
    * indicates whether a result set's own deletes are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownDeletesAreVisible(setType: Double): Boolean
  /**
    * indicates whether a result set's own inserts are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownInsertsAreVisible(setType: Double): Boolean
  /**
    * indicates whether a result set's own updates are visible.
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def ownUpdatesAreVisible(setType: Double): Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseIdentifiers(): Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in lower case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesLowerCaseQuotedIdentifiers(): Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseIdentifiers(): Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesMixedCaseQuotedIdentifiers(): Boolean
  /**
    * Does the database treat mixed case unquoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseIdentifiers(): Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case insensitive and store them in upper case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def storesUpperCaseQuotedIdentifiers(): Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 entry level SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92EntryLevelSQL(): Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 full SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92FullSQL(): Boolean
  /**
    * @returns `TRUE` , if the database supports ANSI92 intermediate SQL grammar, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsANSI92IntermediateSQL(): Boolean
  /**
    * support the Database "ALTER TABLE" with add column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithAddColumn(): Boolean
  /**
    * support the Database "ALTER TABLE" with drop column?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsAlterTableWithDropColumn(): Boolean
  /**
    * indicates whether the driver supports batch updates.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsBatchUpdates(): Boolean
  /**
    * Can a catalog name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInDataManipulation(): Boolean
  /**
    * Can a catalog name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInIndexDefinitions(): Boolean
  /**
    * Can a catalog name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInPrivilegeDefinitions(): Boolean
  /**
    * Can a catalog name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInProcedureCalls(): Boolean
  /**
    * Can a catalog name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCatalogsInTableDefinitions(): Boolean
  /**
    * support the Database column aliasing?
    *
    * The SQL AS clause can be used to provide names for computed columns or to provide alias names for columns as required.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsColumnAliasing(): Boolean
  /**
    * `TRUE` , if the Database supports the CONVERT between the given SQL types otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsConvert(fromType: Double, toType: Double): Boolean
  /**
    * `TRUE` , if the database supports ODBC Core SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCoreSQLGrammar(): Boolean
  /**
    * Are correlated subqueries supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsCorrelatedSubqueries(): Boolean
  /**
    * support the Database both data definition and data manipulation statements within a transaction?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataDefinitionAndDataManipulationTransactions(): Boolean
  /**
    * are only data manipulation statements within a transaction supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDataManipulationTransactionsOnly(): Boolean
  /**
    * If table correlation names are supported, are they restricted to be different from the names of the tables?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsDifferentTableCorrelationNames(): Boolean
  /**
    * Are expressions in "ORDER BY" lists supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExpressionsInOrderBy(): Boolean
  /**
    * `TRUE` , if the database supports ODBC Extended SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsExtendedSQLGrammar(): Boolean
  /**
    * @returns `TRUE` , if full nested outer joins are supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsFullOuterJoins(): Boolean
  /**
    * Is some form of "GROUP BY" clause supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupBy(): Boolean
  /**
    * Can a "GROUP BY" clause add columns not in the SELECT provided it specifies all the columns in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByBeyondSelect(): Boolean
  /**
    * Can a "GROUP BY" clause use columns not in the SELECT?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsGroupByUnrelated(): Boolean
  /**
    * returns `TRUE` , if the Database supports SQL Integrity Enhancement Facility, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsIntegrityEnhancementFacility(): Boolean
  /**
    * Is the escape character in "LIKE" clauses supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsLikeEscapeClause(): Boolean
  /**
    * @returns `TRUE` , if there is limited support for outer joins. (This will be `TRUE` if supportFullOuterJoins is `TRUE` .) `FALSE` is returned otherwise.
    * @throws SQLException if a database access error occurs.
    */
  def supportsLimitedOuterJoins(): Boolean
  /**
    * `TRUE` , if the database supports ODBC Minimum SQL grammar, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMinimumSQLGrammar(): Boolean
  /**
    * use the database "mixed case unquoted SQL identifiers" case sensitive.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseIdentifiers(): Boolean
  /**
    * Does the database treat mixed case quoted SQL identifiers as case sensitive and as a result store them in mixed case?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMixedCaseQuotedIdentifiers(): Boolean
  /**
    * Are multiple XResultSets from a single execute supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleResultSets(): Boolean
  /**
    * Can we have multiple transactions open at once (on different connections)?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsMultipleTransactions(): Boolean
  /**
    * Can columns be defined as non-nullable?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsNonNullableColumns(): Boolean
  /**
    * Can cursors remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossCommit(): Boolean
  /**
    * Can cursors remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenCursorsAcrossRollback(): Boolean
  /**
    * Can statements remain open across commits?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossCommit(): Boolean
  /**
    * Can statements remain open across rollbacks?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOpenStatementsAcrossRollback(): Boolean
  /**
    * Can an "ORDER BY" clause use columns not in the SELECT statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsOrderByUnrelated(): Boolean
  /**
    * @returns `TRUE` , if some form of outer join is supported, otherwise `FALSE` .
    * @throws SQLException if a database access error occurs.
    */
  def supportsOuterJoins(): Boolean
  /**
    * Is positioned DELETE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedDelete(): Boolean
  /**
    * Is positioned UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsPositionedUpdate(): Boolean
  /**
    * Does the database support the concurrency type in combination with the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @param concurrency defined in {@link com.sun.star.sdbc.ResultSetConcurrency}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetConcurrency(setType: Double, concurrency: Double): Boolean
  /**
    * Does the database support the given result set type?
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsResultSetType(setType: Double): Boolean
  /**
    * Can a schema name be used in a data manipulation statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInDataManipulation(): Boolean
  /**
    * Can a schema name be used in an index definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInIndexDefinitions(): Boolean
  /**
    * Can a schema name be used in a privilege definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInPrivilegeDefinitions(): Boolean
  /**
    * Can a schema name be used in a procedure call statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInProcedureCalls(): Boolean
  /**
    * Can a schema name be used in a table definition statement?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSchemasInTableDefinitions(): Boolean
  /**
    * Is SELECT for UPDATE supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSelectForUpdate(): Boolean
  /**
    * Are stored procedure calls using the stored procedure escape syntax supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsStoredProcedures(): Boolean
  /**
    * Are subqueries in comparison expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInComparisons(): Boolean
  /**
    * Are subqueries in "exists" expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInExists(): Boolean
  /**
    * Are subqueries in "in" statements supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInIns(): Boolean
  /**
    * Are subqueries in quantified expressions supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsSubqueriesInQuantifieds(): Boolean
  /**
    * Are table correlation names supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTableCorrelationNames(): Boolean
  /**
    * Does this database support the given transaction isolation level?
    * @returns `TRUE` if so
    * @see com.sun.star.sdbc.Connection
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactionIsolationLevel(level: Double): Boolean
  /**
    * support the Database transactions? If not, invoking the method {@link com.sun.star.sdbc.XConnection.commit()} is a noop and the isolation level is
    * TransactionIsolation_NONE.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTransactions(): Boolean
  /**
    * `TRUE` , if the Database supports the CONVERT function between SQL types, otherwise `FALSE` .
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsTypeConversion(): Boolean
  /**
    * Is SQL UNION supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnion(): Boolean
  /**
    * Is SQL UNION ALL supported?
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def supportsUnionAll(): Boolean
  /**
    * indicates whether or not a visible row update can be detected by calling the method `XResultSet.rowUpdated` .
    * @param setType defined in {@link com.sun.star.sdbc.ResultSetType}
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def updatesAreDetected(setType: Double): Boolean
  /**
    * use the database one local file to save for each table.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFilePerTable(): Boolean
  /**
    * use the database local files to save the tables.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def usesLocalFiles(): Boolean
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
}

