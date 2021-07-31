package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PartialStatement
  *
  * In addition to the methods documented above, the query builder provides all methods of PartialStatement objects.
  *  Statement objects have a method toAQL() which returns their  representation as a JavaScript string.
  *
  * Examples
  *
  * qb.for('doc').in('my_collection').return('doc._key').toAQL()
  * // => FOR doc IN my_collection RETURN doc._key
  */
@js.native
trait PartialStatement extends StObject {
  
  /**
    * COLLECT
    *
    * COLLECT WITH COUNT INTO varname
    * PartialStatement::collectWithCountInto(varname): CollectExpression
    *
    * Examples
    *
    * _.collectWithCountInto('x'): COLLECT WITH COUNT INTO x COLLECT varname = expression
    * PartialStatement::collect(varname, expression): CollectExpression
    *
    *  _.collect('x', 'y'): COLLECT x = y COLLECT var1 = expr1, var2 = expr2, …, varn = exprn
    * PartialStatement::collect(definitions): CollectExpression
    *
    * _.collect({x: 'a', y: 'b'}): COLLECT x = a, y = b WITH COUNT INTO varname
    * CollectExpression::withCountInto(varname): CollectExpression
    *
    * _.withCountInto('x'): WITH COUNT INTO x INTO varname
    * CollectExpression::into(varname): CollectExpression
    *
    * _.into('z'): INTO z KEEP ...vars
    * CollectExpression::keep(...vars): CollectExpression
    *
    * _.into('z').keep('a', 'b'): INTO z KEEP a, b INTO varname = expression
    * CollectExpression::into(varname, expression): CollectExpression
    *
    * _.into('x', 'y'): INTO x = y OPTIONS options
    * CollectExpression::options(options): CollectExpression
    *
    * _.options('opts'): OPTIONS opts
    *
    */
  def collect(varname: js.Any, expr: js.Any): CollectExpression = js.native
  
  /**
    * COLLECT
    *
    * COLLECT WITH COUNT INTO varname
    * PartialStatement::collectWithCountInto(varname): CollectExpression
    *
    * Examples
    *
    * _.collectWithCountInto('x'): COLLECT WITH COUNT INTO x COLLECT varname = expression
    * PartialStatement::collect(varname, expression): CollectExpression
    *
    *  _.collect('x', 'y'): COLLECT x = y COLLECT var1 = expr1, var2 = expr2, …, varn = exprn
    * PartialStatement::collect(definitions): CollectExpression
    *
    * _.collect({x: 'a', y: 'b'}): COLLECT x = a, y = b WITH COUNT INTO varname
    * CollectExpression::withCountInto(varname): CollectExpression
    *
    * _.withCountInto('x'): WITH COUNT INTO x INTO varname
    * CollectExpression::into(varname): CollectExpression
    *
    * _.into('z'): INTO z KEEP ...vars
    * CollectExpression::keep(...vars): CollectExpression
    *
    * _.into('z').keep('a', 'b'): INTO z KEEP a, b INTO varname = expression
    * CollectExpression::into(varname, expression): CollectExpression
    *
    * _.into('x', 'y'): INTO x = y OPTIONS options
    * CollectExpression::options(options): CollectExpression
    *
    * _.options('opts'): OPTIONS opts
    *
    */
  def collectWithCountInto(varname: js.Any): CollectWithCountIntoExpression = js.native
  
  /**
    * FILTER expression
    *
    * PartialStatement::filter(expression): PartialStatement
    *
    * Examples
    *
    * _.filter(qb.eq('a', 'b')): FILTER a == b
    *
    */
  def filter(varname: js.Any): FilterExpression = js.native
  
  /**
    * FOR expression IN collection
    *
    * PartialStatement::for(expression).in(collection): PartialStatement
    *
    * Examples
    *
    * _.for('doc').in('my_collection'): FOR doc IN my_collection
    *
    */
  def `for`(varname: js.Any): ForRet = js.native
  
  /**
    * INSERT
    *
    * INSERT expression INTO collection
    *  PartialStatement::insert(expression).into(collection): InsertExpression
    *
    * Alias: insert(expression).in(collection)
    *
    * Examples
    *
    * _.insert('x').into('y'): INSERT x INTO y OPTIONS options
    * InsertExpression::options(options): InsertExpression
    *
    *  _.options('opts'): OPTIONS opts LET varname = NEW RETURN varname
    * InsertExpression::returnNew(varname): ReturnExpression
    *
    * _.returnNew('z'): LET z = NEW RETURN z
    *
    */
  def insert(expr: js.Any): InsertRet = js.native
  
  /**
    * LET varname = expression
    *
    * PartialStatement::let(varname, expression): PartialStatement
    *
    * Examples
    *
    * _.let('foo', 23): LET foo = 23
    *
    * LET var1 = expr1, var2 = expr2, …, varn = exprn
    *
    * PartialStatement::let(definitions): PartialStatement
    *
    */
  def let(varname: js.Object, expr: js.Any): LetExpression = js.native
  
  /**
    * LIMIT offset, count
    *
    * PartialStatement::limit([offset,] count): PartialStatement
    *
    * Examples
    *
    * _.limit(20): LIMIT 20
    *
    * _.limit(20, 20): LIMIT 20, 20
    *
    */
  def limit(offset: js.Any): LimitExpression = js.native
  def limit(offset: js.Any, count: js.Any): LimitExpression = js.native
  
  /**
    * REMOVE
    *
    * REMOVE expression IN collection
    * PartialStatement::remove(expression).in(collection): RemoveExpression
    *
    * Alias: remove(expression).into(collection)
    *
    * Examples
    *
    * _.remove('x').in('y'): REMOVE x IN y LET varname = OLD RETURN varname
    * RemoveExpression::returnOld(varname): ReturnExpression
    *
    * _.returnOld('z'): LET z = OLD RETURN z OPTIONS options
    * RemoveExpression::options(options): RemoveExpression
    *
    * _.options('opts'): OPTIONS opts
    *
    */
  def remove(expr: js.Any): RemoveRet = js.native
  
  /**
    * REPLACE
    *
    * REPLACE expression IN collection
    * PartialStatement::replace(expression).in(collection): ReplaceExpression
    *
    * Alias: replace(expression).into(collection)
    *
    * Examples
    *
    * _.replace('x').in('y'): REPLACE x IN y REPLACE expression1 WITH expression2 IN collection
    * PartialStatement::replace(expression1).with(expression2).in(collection): ReplaceExpression
    *
    * Alias: replace(expression1).with(expression2).into(collection)
    *
    * _.replace('x').with('y').in('z'): REPLACE x WITH y IN z OPTIONS options
    * ReplaceExpression::options(options): ReplaceExpression
    *
    * _.options('opts'): OPTIONS opts LET varname = NEW RETURN varname
    *  ReplaceExpression::returnOld(varname): ReturnExpression
    *
    * _.returnNew('z'): LET z = NEW RETURN z LET varname = OLD RETURN varname
    * ReplaceExpression::returnNew(varname): ReturnExpression
    *
    * _.returnOld('z'): LET z = OLD RETURN z
    *
    */
  def replace(expr: js.Any): ReplaceRetWithRet = js.native
  
  /**
    * RETURN expression
    *
    * PartialStatement::return(expression): ReturnExpression
    *
    * Examples
    *
    * _.return('x'): RETURN x
    * _.return({x: 'x'}): RETURN {x: x}
    *
    */
  def `return`(x: js.Any): ReturnExpression = js.native
  
  /**
    * RETURN DISTINCT expression
    *
    * PartialStatement::returnDistinct(expression): ReturnExpression
    *
    * Examples
    *
    * _.returnDistinct('x'): RETURN DISTINCT x
    *
    */
  def returnDistinct(x: js.Any): ReturnExpression = js.native
  
  /**
    * SORT ...args
    *
    * PartialStatement::sort(...args): PartialStatement
    *
    * Examples
    *
    * _.sort('x', 'DESC', 'y', 'ASC'): SORT x DESC, y ASC
    *
    */
  def sort(args: js.Any*): SortExpression = js.native
  
  /**
    * UPDATE
    *
    * UPDATE expression IN collection
    * PartialStatement::update(expression).in(collection): UpdateExpression
    *
    * Alias: update(expression).into(collection)
    *
    * Examples
    *
    * _.update('x').in('y'): UPDATE x IN y
    *
    * UPDATE expression1 WITH expression2 IN collection
    * PartialStatement::update(expression1).with(expression2).in(collection): UpdateExpression
    *
    * Alias: update(expression1).with(expression2).into(collection)
    *
    * _.update('x').with('y').in('z'): UPDATE x WITH y IN z OPTIONS options
    * UpdateExpression::options(options): UpdateExpression
    *
    * _.options('opts'): OPTIONS opts LET varname = NEW RETURN varname
    * UpdateExpression::returnNew(varname): ReturnExpression
    *
    * _.returnNew('z'): LET z = NEW RETURN z LET varname = OLD RETURN varname
    * UpdateExpression::returnOld(varname): ReturnExpression
    *
    * _.returnOld('z'): LET z = OLD RETURN z
    *
    */
  def update(expr: js.Any): UpdateRetWithRet = js.native
  
  /**
    * UPSERT
    *
    * UPSERT expression1 INSERT expression2 REPLACE expression3 IN collection
    * PartialStatement::upsert(expression1).insert(expression2).replace(expression3).in(collection): UpsertExpression
    *
    * Alias: ….into(collection)
    *
    * Examples
    *
    * _.upsert('x').insert('y').replace('z').in('c'): UPSERT x INSERT y REPLACE z IN c
    *
    * UPSERT expression1 INSERT expression2 UPDATE expression3 IN collection
    * PartialStatement::upsert(expression1).insert(expression2).update(expression3).in(collection): UpsertExpression
    *
    * Alias: ….into(collection)
    *
    * _.upsert('x').insert('y').update('z').in('c'): UPSERT x INSERT y UPDATE z IN c OPTIONS options
    * UpsertExpression::options(options): UpsertExpression
    *
    * _.options('opts'): OPTIONS opts
    *
    */
  def upsert(expr: js.Any): UpsertRet = js.native
}
