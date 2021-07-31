package typings.asyncCsv

import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param options
    */
  @scala.inline
  def generate(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def generate(options: CsvGenerateOptions): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  /**
    * Parses a CSV file into an array of rows.
    *
    * @param input
    * @param options
    */
  @scala.inline
  def parse(input: String): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def parse(input: String, options: CsvParseOptions): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  /**
    * Converts an array of rows into a CSV string.
    *
    * @param data
    * @param options
    */
  @scala.inline
  def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]], options: CsvStringifyOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    *
    * @param data
    * @param handler
    * @param options
    */
  @scala.inline
  def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[js.Any], 
      U
    ]
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  @scala.inline
  def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[js.Any], 
      U
    ],
    options: TransformOptions
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  
  type Cast[T] = js.Function2[/* value */ T, /* context */ CastingContext, String]
  
  trait CastingContext extends StObject {
    
    val column: js.UndefOr[Double | String] = js.undefined
    
    val empty_lines: Double
    
    val header: Boolean
    
    val index: Double
    
    val invalid_field_length: Double
    
    val lines: Double
    
    val quoting: Boolean
    
    val records: Double
  }
  object CastingContext {
    
    @scala.inline
    def apply(
      empty_lines: Double,
      header: Boolean,
      index: Double,
      invalid_field_length: Double,
      lines: Double,
      quoting: Boolean,
      records: Double
    ): CastingContext = {
      val __obj = js.Dynamic.literal(empty_lines = empty_lines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    @scala.inline
    implicit class CastingContextMutableBuilder[Self <: CastingContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid_field_length(value: Double): Self = StObject.set(x, "invalid_field_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoting(value: Boolean): Self = StObject.set(x, "quoting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type CastingDateFunction = js.Function2[/* value */ String, /* context */ CastingContext, Date]
  
  type CastingFunction = js.Function2[/* value */ String, /* context */ CastingContext, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Unit
    - scala.Null
    - typings.asyncCsv.asyncCsvBooleans.`false`
    - typings.asyncCsv.anon.Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | String | Null]
  
  trait CsvGenerateOptions extends StObject {
    
    /**
      * Define the number of generated fields and the generation method.
      */
    var columns: js.UndefOr[Double | js.Array[String]] = js.undefined
    
    /**
      * Set the field delimiter.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Period to run in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, then buffers will be decoded to strings using the
      * specified encoding.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * When to stop the generation.
      */
    var end: js.UndefOr[Double | Date] = js.undefined
    
    /**
      * One or multiple characters to print at the end of the file; only
      * apply when objectMode is disabled.
      */
    var eof: js.UndefOr[Boolean | String] = js.undefined
    
    var fixedSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate buffers equals length as defined by the
      * `highWaterMark` option.
      */
    var fixed_size: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of bytes to store in the internal buffer before
      * ceasing to read from the underlying resource.
      */
    var high_water_mark: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of lines or records to generate.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    var maxWordLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of characters per word.
      */
    var max_word_length: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this stream should behave as a stream of objects.
      */
    var object_mode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One or multiple characters used to delimit records.
      */
    var row_delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Generate idempotent random characters if a number provided.
      */
    var seed: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The time to wait between the generation of each records
      */
    var sleep: js.UndefOr[Double] = js.undefined
  }
  object CsvGenerateOptions {
    
    @scala.inline
    def apply(): CsvGenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvGenerateOptions]
    }
    
    @scala.inline
    implicit class CsvGenerateOptionsMutableBuilder[Self <: CsvGenerateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Double | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEof(value: Boolean | String): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      @scala.inline
      def setFixedSize(value: Boolean): Self = StObject.set(x, "fixedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedSizeUndefined: Self = StObject.set(x, "fixedSize", js.undefined)
      
      @scala.inline
      def setFixed_size(value: Boolean): Self = StObject.set(x, "fixed_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixed_sizeUndefined: Self = StObject.set(x, "fixed_size", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setHigh_water_mark(value: Double): Self = StObject.set(x, "high_water_mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh_water_markUndefined: Self = StObject.set(x, "high_water_mark", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxWordLength(value: Double): Self = StObject.set(x, "maxWordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWordLengthUndefined: Self = StObject.set(x, "maxWordLength", js.undefined)
      
      @scala.inline
      def setMax_word_length(value: Double): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setObject_mode(value: Boolean): Self = StObject.set(x, "object_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject_modeUndefined: Self = StObject.set(x, "object_mode", js.undefined)
      
      @scala.inline
      def setRow_delimiter(value: String): Self = StObject.set(x, "row_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow_delimiterUndefined: Self = StObject.set(x, "row_delimiter", js.undefined)
      
      @scala.inline
      def setSeed(value: Boolean | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSleep(value: Double): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
    }
  }
  
  trait CsvParseOptions extends StObject {
    
    /**
      * If true, the parser will attempt to convert read data types to
      * native types.
      *
      * @deprecated Use {@link cast}
      */
    var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert read data types to dates.
      * It requires the "auto_parse" option.
      *
      * @deprecated Use {@link cast_date}
      */
    var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * If true, detect and exclude the byte order mark (BOM) from the CSV
      * input, if present.
      */
    var bom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to native
      * types. If a function, receive the value as first argument, a context
      * as second argument and return a new value. More information about the
      * context properties is available below.
      */
    var cast: js.UndefOr[Boolean | CastingFunction] = js.undefined
    
    /**
      * If true, the parser will attempt to convert input string to dates.
      * If a function, receive the value as argument and return a new value.
      * It requires the "auto_parse" option. Be careful, it relies
      * on `Date.parse`.
      */
    var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
    
    /**
      * List of fields as an array, a user defined callback accepting the
      * first line and returning the column names or true if auto-discovered
      * in the first CSV line. Defaults to null. Affects the result data set
      * in the sense that records will be objects instead of arrays.
      */
    var columns: js.UndefOr[
        js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
      ] = js.undefined
    
    /**
      * Treat all the characters after this one as a comment.
      * Default to '' (disabled).
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Set the field delimiter. One character only, defaults to comma.
      */
    var delimiter: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Set the escape character, one character only.
      * Defaults to double quotes.
      */
    var escape: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Start handling records from the requested number of records.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      * Start handling records from the requested line number.
      */
    var from_line: js.UndefOr[Double] = js.undefined
    
    /**
      * Generate two properties `info` and `record` where `info` is a
      * snapshot of the info object at the time the record was created and
      * `record` is the parsed array or object.
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately following the delimiter (i.e.
      * left-trim all fields), defaults to false. Does not remove whitespace
      * in a quoted field.
      */
    var ltrim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of characters to be contained in the field and line
      * buffers before an exception is raised, used to guard against a wrong
      * delimiter or `record_delimiter`, default to 128,000 characters.
      */
    var max_record_size: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of header-record title to name objects by.
      */
    var objname: js.UndefOr[String] = js.undefined
    
    /**
      * Optional character surrounding a field, one character only, defaults
      * to double quotes.
      */
    var quote: js.UndefOr[String | Boolean | Buffer] = js.undefined
    
    /**
      * Generate two properties raw and row where raw is the original CSV row
      * content and row is the parsed array or object.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One or multiple characters used to delimit record rows; defaults to
      * auto discovery if not provided. Supported auto discovery method are
      * Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
      */
    var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * Preserve quotes inside unquoted field.
      */
    var relax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discard inconsistent columns count, default to false.
      */
    var relax_column_count: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ignore whitespace immediately preceding the delimiter (i.e.
      * right-trim all fields), defaults to false. Does not remove whitespace
      * in a quoted field.
      */
    var rtrim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dont generate empty values for empty lines.
      * Defaults to false
      */
    var skip_empty_lines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't generate records for lines containing empty column values
      * (column matching /\s*\/), defaults to false.
      */
    var skip_lines_with_empty_values: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip a line with error found inside and directly go process the
      * next line.
      */
    var skip_lines_with_error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stop handling records after the requested number of records.
      */
    var to: js.UndefOr[Double] = js.undefined
    
    /**
      * Stop handling records after the requested line number.
      */
    var to_line: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, ignore whitespace immediately around the delimiter,
      * defaults to `false`. Does not remove whitespace in a quoted field.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object CsvParseOptions {
    
    @scala.inline
    def apply(): CsvParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvParseOptions]
    }
    
    @scala.inline
    implicit class CsvParseOptionsMutableBuilder[Self <: CsvParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_parse(value: Boolean | CastingFunction): Self = StObject.set(x, "auto_parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = StObject.set(x, "auto_parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuto_parseUndefined: Self = StObject.set(x, "auto_parse", js.undefined)
      
      @scala.inline
      def setAuto_parse_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "auto_parse_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => Date): Self = StObject.set(x, "auto_parse_date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuto_parse_dateUndefined: Self = StObject.set(x, "auto_parse_date", js.undefined)
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setCast(value: Boolean | CastingFunction): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = StObject.set(x, "cast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setCast_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "cast_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCast_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => Date): Self = StObject.set(x, "cast_date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCast_dateUndefined: Self = StObject.set(x, "cast_date", js.undefined)
      
      @scala.inline
      def setColumns(
        value: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsFunction1(value: /* record */ js.Any => js.Array[ColumnOption]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnOption*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFrom_line(value: Double): Self = StObject.set(x, "from_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_lineUndefined: Self = StObject.set(x, "from_line", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMax_record_size(value: Double): Self = StObject.set(x, "max_record_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_record_sizeUndefined: Self = StObject.set(x, "max_record_size", js.undefined)
      
      @scala.inline
      def setObjname(value: String): Self = StObject.set(x, "objname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjnameUndefined: Self = StObject.set(x, "objname", js.undefined)
      
      @scala.inline
      def setQuote(value: String | Boolean | Buffer): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
      
      @scala.inline
      def setRecord_delimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "record_delimiter", js.Array(value :_*))
      
      @scala.inline
      def setRelax(value: Boolean): Self = StObject.set(x, "relax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxUndefined: Self = StObject.set(x, "relax", js.undefined)
      
      @scala.inline
      def setRelax_column_count(value: Boolean): Self = StObject.set(x, "relax_column_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelax_column_countUndefined: Self = StObject.set(x, "relax_column_count", js.undefined)
      
      @scala.inline
      def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setSkip_empty_lines(value: Boolean): Self = StObject.set(x, "skip_empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_empty_linesUndefined: Self = StObject.set(x, "skip_empty_lines", js.undefined)
      
      @scala.inline
      def setSkip_lines_with_empty_values(value: Boolean): Self = StObject.set(x, "skip_lines_with_empty_values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_lines_with_empty_valuesUndefined: Self = StObject.set(x, "skip_lines_with_empty_values", js.undefined)
      
      @scala.inline
      def setSkip_lines_with_error(value: Boolean): Self = StObject.set(x, "skip_lines_with_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_lines_with_errorUndefined: Self = StObject.set(x, "skip_lines_with_error", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTo_line(value: Double): Self = StObject.set(x, "to_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_lineUndefined: Self = StObject.set(x, "to_line", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait CsvStringifyOptions extends StObject {
    
    /**
      * Key-value object which defines custom cast for certain data types
      */
    var cast: js.UndefOr[typings.asyncCsv.anon.Boolean] = js.undefined
    
    /**
      * List of fields, applied when `transform` returns an object, the order
      * matters. Read the transformer documentation for additional
      * information. Columns are auto-discovered in the first record when the
      * user write objects can refer to nested properties of the input JSON
      * see the "header" option on how to print columns names on the
      * first line.
      */
    var columns: js.UndefOr[(js.Array[ParseColumnOption | String]) | PlainObject[String]] = js.undefined
    
    /**
      * Set the field delimiter, one character only, defaults to a comma.
      */
    var delimiter: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Add the value of "options.RecordDelimiter" on the last line, default
      * to true.
      */
    var eof: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to the escape read option.
      */
    var escape: js.UndefOr[String | Buffer] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The quote characters, defaults to the ", an empty quote value will
      * preserve the original field.
      */
    var quote: js.UndefOr[String | Buffer | Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all the non-empty fields even if
      * not required.
      */
    var quoted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, no default, quote empty fields and overrides `quoted_string`
      * on empty strings when defined.
      */
    var quoted_empty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all fields matching a
      * regular expression.
      */
    var quoted_match: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean, default to false, quote all fields of type string even if
      * not required.
      */
    var quoted_string: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String used to delimit record rows or a special value. Special values
      * are 'auto', 'unix', 'mac', 'windows', 'ascii', 'unicode'. Defaults
      * to 'auto' (discovered in source or 'unix' if no source is specified).
      */
    var record_delimiter: js.UndefOr[RecordDelimiter] = js.undefined
  }
  object CsvStringifyOptions {
    
    @scala.inline
    def apply(): CsvStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvStringifyOptions]
    }
    
    @scala.inline
    implicit class CsvStringifyOptionsMutableBuilder[Self <: CsvStringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCast(value: typings.asyncCsv.anon.Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setColumns(value: (js.Array[ParseColumnOption | String]) | PlainObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: (ParseColumnOption | String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      @scala.inline
      def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setQuote(value: String | Buffer | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      @scala.inline
      def setQuoted_empty(value: Boolean): Self = StObject.set(x, "quoted_empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_emptyUndefined: Self = StObject.set(x, "quoted_empty", js.undefined)
      
      @scala.inline
      def setQuoted_match(value: Boolean): Self = StObject.set(x, "quoted_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_matchUndefined: Self = StObject.set(x, "quoted_match", js.undefined)
      
      @scala.inline
      def setQuoted_string(value: Boolean): Self = StObject.set(x, "quoted_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_stringUndefined: Self = StObject.set(x, "quoted_string", js.undefined)
      
      @scala.inline
      def setRecord_delimiter(value: RecordDelimiter): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
    }
  }
  
  type ParseColumnOption = js.UndefOr[String | Null]
  
  type PlainObject[T] = Record[String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.asyncCsv.asyncCsvStrings.auto
    - typings.asyncCsv.asyncCsvStrings.unix
    - typings.asyncCsv.asyncCsvStrings.mac
    - typings.asyncCsv.asyncCsvStrings.windows
    - typings.asyncCsv.asyncCsvStrings.ascii
    - typings.asyncCsv.asyncCsvStrings.unicode
  */
  type RecordDelimiter = _RecordDelimiter | String | Buffer
  
  trait TransformOptions extends StObject {
    
    /**
      * In the absence of a consumer, like a `stream.Readable`, trigger the
      * consumption of the stream.
      */
    var consume: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of transformation callbacks to run in parallel; only apply
      * with asynchronous handlers; default to "100".
      */
    var parallel: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass user defined parameters to the user handler as last argument.
      */
    var params: js.UndefOr[js.Any] = js.undefined
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      @scala.inline
      def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait _ColumnOption extends StObject
  
  trait _RecordDelimiter extends StObject
}
