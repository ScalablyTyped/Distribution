package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchFunction extends js.Object {
  var MAX_LENGTH: scala.Double = js.native
  /**
                   * The main function takes a list of strings and one or more glob patterns to use for matching.
                   *
                   * @param list A list of strings to match
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def apply(list: js.Array[java.lang.String], patterns: java.lang.String): js.Array[java.lang.String] = js.native
  /**
                   * The main function takes a list of strings and one or more glob patterns to use for matching.
                   *
                   * @param list A list of strings to match
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def apply(list: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * The main function takes a list of strings and one or more glob patterns to use for matching.
                   *
                   * @param list A list of strings to match
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def apply(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
                   * The main function takes a list of strings and one or more glob patterns to use for matching.
                   *
                   * @param list A list of strings to match
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def apply(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: java.lang.String, patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: java.lang.String, patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if **all** of the given `patterns` match the specified string.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def all(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: java.lang.String, patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: java.lang.String, patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if **any** of the given glob `patterns` match the specified `string`.
                   *
                   * @param str The string to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def any(str: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Expand the given brace `pattern`.
                   *
                   * @param pattern String with brace pattern to expand.
                   * @param options Any options to change how expansion is performed. See the [braces](https://github.com/micromatch/braces) library for all available options.
                   */
  def braces(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  /**
                   * Expand the given brace `pattern`.
                   *
                   * @param pattern String with brace pattern to expand.
                   * @param options Any options to change how expansion is performed. See the [braces](https://github.com/micromatch/braces) library for all available options.
                   */
  def braces(pattern: java.lang.String, options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * Returns an array of matches captured by `pattern` in `string, or`null` if the pattern did not match.
                   *
                   * @param pattern Glob pattern to use for matching.
                   * @param string String to match
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of captures if the string matches the glob pattern, otherwise `null`.
                   */
  def capture(pattern: java.lang.String, string: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  /**
                   * Returns an array of matches captured by `pattern` in `string, or`null` if the pattern did not match.
                   *
                   * @param pattern Glob pattern to use for matching.
                   * @param string String to match
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of captures if the string matches the glob pattern, otherwise `null`.
                   */
  def capture(pattern: java.lang.String, string: java.lang.String, options: MatchOptions): js.Array[java.lang.String] | scala.Null = js.native
  def clearCache(): scala.Unit = js.native
  /**
                   * Compile the given `ast` or string with the given `options`.
                   *
                   * @returns Returns an object that has an `output` property with the compiled string.
                   */
  def compile(ast: java.lang.String): js.Object = js.native
  /**
                   * Compile the given `ast` or string with the given `options`.
                   *
                   * @returns Returns an object that has an `output` property with the compiled string.
                   */
  def compile(ast: java.lang.String, options: MatchOptions): js.Object = js.native
  /**
                   * Compile the given `ast` or string with the given `options`.
                   *
                   * @returns Returns an object that has an `output` property with the compiled string.
                   */
  def compile(ast: js.Object): js.Object = js.native
  /**
                   * Compile the given `ast` or string with the given `options`.
                   *
                   * @returns Returns an object that has an `output` property with the compiled string.
                   */
  def compile(ast: js.Object, options: MatchOptions): js.Object = js.native
  /**
                   * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
                   *
                   * @param str The string to match.
                   * @param patterns Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the patter matches any part of `str`.
                   */
  def contains(str: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
                   *
                   * @param str The string to match.
                   * @param patterns Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the patter matches any part of `str`.
                   */
  def contains(str: java.lang.String, patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
                   *
                   * @param str The string to match.
                   * @param patterns Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the patter matches any part of `str`.
                   */
  def contains(str: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
                   *
                   * @param str The string to match.
                   * @param patterns Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the patter matches any part of `str`.
                   */
  def contains(str: java.lang.String, patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Parses the given glob `pattern` and returns an array of abstract syntax trees (ASTs), with the compiled `output` and optional source `map` on each AST.
                   *
                   * @param pattern Glob pattern to parse and compile.
                   * @param options Any options to change how parsing and compiling is performed.
                   * @returns Returns an object with the parsed AST, compiled string and optional source map.
                   */
  def create(pattern: java.lang.String): js.Object = js.native
  /**
                   * Parses the given glob `pattern` and returns an array of abstract syntax trees (ASTs), with the compiled `output` and optional source `map` on each AST.
                   *
                   * @param pattern Glob pattern to parse and compile.
                   * @param options Any options to change how parsing and compiling is performed.
                   * @returns Returns an object with the parsed AST, compiled string and optional source map.
                   */
  def create(pattern: java.lang.String, options: MatchOptions): js.Object = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: java.lang.String, patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: java.lang.String, patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if every string in the given `list` matches any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def every(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  def getCache(): js.Object = js.native
  /**
                   * Returns true if the specified `string` matches the given glob `pattern`.
                   *
                   * @param string String to match
                   * @param pattern Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the string matches the glob pattern.
                   */
  def isMatch(string: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if the specified `string` matches the given glob `pattern`.
                   *
                   * @param string String to match
                   * @param pattern Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if the string matches the glob pattern.
                   */
  def isMatch(string: java.lang.String, pattern: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Create a regular expression from the given glob `pattern`.
                   *
                   * @param pattern A glob pattern to convert to regex.
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a regex created from the given pattern.
                   */
  def makeRe(pattern: java.lang.String): stdLib.RegExp = js.native
  /**
                   * Create a regular expression from the given glob `pattern`.
                   *
                   * @param pattern A glob pattern to convert to regex.
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a regex created from the given pattern.
                   */
  def makeRe(pattern: java.lang.String, options: MatchOptions): stdLib.RegExp = js.native
  /**
                   * Similar to the main function, but `pattern` must be a string.
                   *
                   * @param list Array of strings to match
                   * @param pattern Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def `match`(list: js.Array[java.lang.String], pattern: java.lang.String): js.Array[java.lang.String] = js.native
  /**
                   * Similar to the main function, but `pattern` must be a string.
                   *
                   * @param list Array of strings to match
                   * @param pattern Glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of matches
                   */
  def `match`(list: js.Array[java.lang.String], pattern: java.lang.String, options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
                   * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
                   *
                   * @param object The object with keys to filter.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an object with only keys that match the given patterns.
                   */
  def matchKeys[T](`object`: T, patterns: java.lang.String): stdLib.Partial[T] = js.native
  /**
                   * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
                   * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
                   *
                   * @param object The object with keys to filter.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an object with only keys that match the given patterns.
                   */
  def matchKeys[T](`object`: T, patterns: java.lang.String, options: MatchOptions): stdLib.Partial[T] = js.native
  /**
                   * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
                   * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
                   *
                   * @param object The object with keys to filter.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an object with only keys that match the given patterns.
                   */
  def matchKeys[T](`object`: T, patterns: js.Array[java.lang.String]): stdLib.Partial[T] = js.native
  /**
                   * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
                   * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
                   *
                   * @param object The object with keys to filter.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an object with only keys that match the given patterns.
                   */
  def matchKeys[T](`object`: T, patterns: js.Array[java.lang.String], options: MatchOptions): stdLib.Partial[T] = js.native
  /**
                   * Returns a memoized matcher function from the given glob `pattern` and `options`.
                   * The returned function takes a string to match as its only argument and returns true if the string is a match.
                   *
                   * @param pattern Glob pattern
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a matcher function.
                   */
  def matcher(pattern: java.lang.String): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
                   * Returns a memoized matcher function from the given glob `pattern` and `options`.
                   * The returned function takes a string to match as its only argument and returns true if the string is a match.
                   *
                   * @param pattern Glob pattern
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a matcher function.
                   */
  def matcher(pattern: java.lang.String, options: MatchOptions): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
                   * Returns a memoized matcher function from the given glob `pattern` and `options`.
                   * The returned function takes a string to match as its only argument and returns true if the string is a match.
                   *
                   * @param pattern Glob pattern
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a matcher function.
                   */
  def matcher(pattern: js.Array[java.lang.String]): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
                   * Returns a memoized matcher function from the given glob `pattern` and `options`.
                   * The returned function takes a string to match as its only argument and returns true if the string is a match.
                   *
                   * @param pattern Glob pattern
                   * @param options See available options for changing how matches are performed.
                   * @returns Returns a matcher function.
                   */
  def matcher(pattern: js.Array[java.lang.String], options: MatchOptions): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
                   * Returns a list of strings that _**do not match any**_ of the given `patterns`.
                   *
                   * @param list Array of strings to match.
                   * @param patterns One or more glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of strings that **do not match** the given patterns.
                   */
  def not(list: js.Array[java.lang.String], patterns: java.lang.String): js.Array[java.lang.String] = js.native
  /**
                   * Returns a list of strings that _**do not match any**_ of the given `patterns`.
                   *
                   * @param list Array of strings to match.
                   * @param patterns One or more glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of strings that **do not match** the given patterns.
                   */
  def not(list: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * Returns a list of strings that _**do not match any**_ of the given `patterns`.
                   *
                   * @param list Array of strings to match.
                   * @param patterns One or more glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of strings that **do not match** the given patterns.
                   */
  def not(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
                   * Returns a list of strings that _**do not match any**_ of the given `patterns`.
                   *
                   * @param list Array of strings to match.
                   * @param patterns One or more glob pattern to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns an array of strings that **do not match** the given patterns.
                   */
  def not(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): js.Array[java.lang.String] = js.native
  /**
                   * Parse the given `str` with the given `options`.
                   *
                   * @returns Returns an AST
                   */
  def parse(str: java.lang.String): js.Object = js.native
  /**
                   * Parse the given `str` with the given `options`.
                   *
                   * @returns Returns an AST
                   */
  def parse(str: java.lang.String, options: MatchOptions): js.Object = js.native
  def resizeCache(newSize: scala.Double): scala.Unit = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: java.lang.String, patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: java.lang.String, patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: java.lang.String, patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: java.lang.String, patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: js.Array[java.lang.String], patterns: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: js.Array[java.lang.String], patterns: java.lang.String, options: MatchOptions): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
                   * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
                   *
                   * @param list The string or array of strings to test. Returns as soon as the first match is found.
                   * @param patterns One or more glob patterns to use for matching.
                   * @param options See available options for changing how matches are performed
                   * @returns Returns true if any patterns match `str`
                   */
  def some(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: MatchOptions): scala.Boolean = js.native
}

